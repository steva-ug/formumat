package digital.steva.formumat.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Accessible
import androidx.compose.material.icons.automirrored.filled.AccessibleForward
import androidx.compose.material.icons.automirrored.filled.AddToHomeScreen
import androidx.compose.material.icons.automirrored.filled.AirplaneTicket
import androidx.compose.material.icons.automirrored.filled.AlignHorizontalLeft
import androidx.compose.material.icons.automirrored.filled.AlignHorizontalRight
import androidx.compose.material.icons.automirrored.filled.AltRoute
import androidx.compose.material.icons.automirrored.filled.Announcement
import androidx.compose.material.icons.automirrored.filled.ArrowBackIos
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material.icons.automirrored.filled.ArrowLeft
import androidx.compose.material.icons.automirrored.filled.ArrowRight
import androidx.compose.material.icons.automirrored.filled.ArrowRightAlt
import androidx.compose.material.icons.automirrored.filled.Article
import androidx.compose.material.icons.automirrored.filled.Assignment
import androidx.compose.material.icons.automirrored.filled.AssignmentReturn
import androidx.compose.material.icons.automirrored.filled.AssistantDirection
import androidx.compose.material.icons.automirrored.filled.Backspace
import androidx.compose.material.icons.automirrored.filled.BatteryUnknown
import androidx.compose.material.icons.automirrored.filled.BluetoothSearching
import androidx.compose.material.icons.automirrored.filled.BrandingWatermark
import androidx.compose.material.icons.automirrored.filled.CallMade
import androidx.compose.material.icons.automirrored.filled.CallMerge
import androidx.compose.material.icons.automirrored.filled.CallMissed
import androidx.compose.material.icons.automirrored.filled.CallMissedOutgoing
import androidx.compose.material.icons.automirrored.filled.CallReceived
import androidx.compose.material.icons.automirrored.filled.CallSplit
import androidx.compose.material.icons.automirrored.filled.Chat
import androidx.compose.material.icons.automirrored.filled.ChromeReaderMode
import androidx.compose.material.icons.automirrored.filled.Comment
import androidx.compose.material.icons.automirrored.filled.CompareArrows
import androidx.compose.material.icons.automirrored.filled.ContactSupport
import androidx.compose.material.icons.automirrored.filled.DirectionsBike
import androidx.compose.material.icons.automirrored.filled.DirectionsRun
import androidx.compose.material.icons.automirrored.filled.DirectionsWalk
import androidx.compose.material.icons.automirrored.filled.DriveFileMove
import androidx.compose.material.icons.automirrored.filled.Dvr
import androidx.compose.material.icons.automirrored.filled.EventNote
import androidx.compose.material.icons.automirrored.filled.FactCheck
import androidx.compose.material.icons.automirrored.filled.FeaturedPlayList
import androidx.compose.material.icons.automirrored.filled.FeaturedVideo
import androidx.compose.material.icons.automirrored.filled.Feed
import androidx.compose.material.icons.automirrored.filled.FollowTheSigns
import androidx.compose.material.icons.automirrored.filled.FormatAlignLeft
import androidx.compose.material.icons.automirrored.filled.FormatAlignRight
import androidx.compose.material.icons.automirrored.filled.FormatIndentDecrease
import androidx.compose.material.icons.automirrored.filled.FormatIndentIncrease
import androidx.compose.material.icons.automirrored.filled.FormatListBulleted
import androidx.compose.material.icons.automirrored.filled.FormatTextdirectionLToR
import androidx.compose.material.icons.automirrored.filled.FormatTextdirectionRToL
import androidx.compose.material.icons.automirrored.filled.Forward
import androidx.compose.material.icons.automirrored.filled.ForwardToInbox
import androidx.compose.material.icons.automirrored.filled.Grading
import androidx.compose.material.icons.automirrored.filled.Help
import androidx.compose.material.icons.automirrored.filled.HelpCenter
import androidx.compose.material.icons.automirrored.filled.HelpOutline
import androidx.compose.material.icons.automirrored.filled.Input
import androidx.compose.material.icons.automirrored.filled.InsertComment
import androidx.compose.material.icons.automirrored.filled.InsertDriveFile
import androidx.compose.material.icons.automirrored.filled.KeyboardBackspace
import androidx.compose.material.icons.automirrored.filled.KeyboardReturn
import androidx.compose.material.icons.automirrored.filled.KeyboardTab
import androidx.compose.material.icons.automirrored.filled.Label
import androidx.compose.material.icons.automirrored.filled.LabelImportant
import androidx.compose.material.icons.automirrored.filled.LabelOff
import androidx.compose.material.icons.automirrored.filled.LastPage
import androidx.compose.material.icons.automirrored.filled.Launch
import androidx.compose.material.icons.automirrored.filled.LibraryBooks
import androidx.compose.material.icons.automirrored.filled.ListAlt
import androidx.compose.material.icons.automirrored.filled.LiveHelp
import androidx.compose.material.icons.automirrored.filled.Login
import androidx.compose.material.icons.automirrored.filled.Logout
import androidx.compose.material.icons.automirrored.filled.ManageSearch
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.automirrored.filled.MenuOpen
import androidx.compose.material.icons.automirrored.filled.MergeType
import androidx.compose.material.icons.automirrored.filled.Message
import androidx.compose.material.icons.automirrored.filled.MissedVideoCall
import androidx.compose.material.icons.automirrored.filled.MobileScreenShare
import androidx.compose.material.icons.automirrored.filled.More
import androidx.compose.material.icons.automirrored.filled.MultilineChart
import androidx.compose.material.icons.automirrored.filled.NavigateBefore
import androidx.compose.material.icons.automirrored.filled.NavigateNext
import androidx.compose.material.icons.automirrored.filled.NextPlan
import androidx.compose.material.icons.automirrored.filled.NextWeek
import androidx.compose.material.icons.automirrored.filled.NotListedLocation
import androidx.compose.material.icons.automirrored.filled.Note
import androidx.compose.material.icons.automirrored.filled.NoteAdd
import androidx.compose.material.icons.automirrored.filled.Notes
import androidx.compose.material.icons.automirrored.filled.OfflineShare
import androidx.compose.material.icons.automirrored.filled.OpenInNew
import androidx.compose.material.icons.automirrored.filled.Outbound
import androidx.compose.material.icons.automirrored.filled.PhoneCallback
import androidx.compose.material.icons.automirrored.filled.PhoneForwarded
import androidx.compose.material.icons.automirrored.filled.PhoneMissed
import androidx.compose.material.icons.automirrored.filled.PlaylistAdd
import androidx.compose.material.icons.automirrored.filled.PlaylistAddCheck
import androidx.compose.material.icons.automirrored.filled.PlaylistPlay
import androidx.compose.material.icons.automirrored.filled.QueueMusic
import androidx.compose.material.icons.automirrored.filled.ReadMore
import androidx.compose.material.icons.automirrored.filled.ReceiptLong
import androidx.compose.material.icons.automirrored.filled.Redo
import androidx.compose.material.icons.automirrored.filled.Reply
import androidx.compose.material.icons.automirrored.filled.ReplyAll
import androidx.compose.material.icons.automirrored.filled.RotateLeft
import androidx.compose.material.icons.automirrored.filled.RotateRight
import androidx.compose.material.icons.automirrored.filled.Rtt
import androidx.compose.material.icons.automirrored.filled.Rule
import androidx.compose.material.icons.automirrored.filled.ScheduleSend
import androidx.compose.material.icons.automirrored.filled.ScreenShare
import androidx.compose.material.icons.automirrored.filled.Segment
import androidx.compose.material.icons.automirrored.filled.SendAndArchive
import androidx.compose.material.icons.automirrored.filled.SendToMobile
import androidx.compose.material.icons.automirrored.filled.ShortText
import androidx.compose.material.icons.automirrored.filled.Shortcut
import androidx.compose.material.icons.automirrored.filled.ShowChart
import androidx.compose.material.icons.automirrored.filled.Sort
import androidx.compose.material.icons.automirrored.filled.SpeakerNotes
import androidx.compose.material.icons.automirrored.filled.StarHalf
import androidx.compose.material.icons.automirrored.filled.StickyNote2
import androidx.compose.material.icons.automirrored.filled.StopScreenShare
import androidx.compose.material.icons.automirrored.filled.Subject
import androidx.compose.material.icons.automirrored.filled.TextSnippet
import androidx.compose.material.icons.automirrored.filled.Toc
import androidx.compose.material.icons.automirrored.filled.TrendingDown
import androidx.compose.material.icons.automirrored.filled.TrendingFlat
import androidx.compose.material.icons.automirrored.filled.TrendingUp
import androidx.compose.material.icons.automirrored.filled.Undo
import androidx.compose.material.icons.automirrored.filled.ViewList
import androidx.compose.material.icons.automirrored.filled.ViewQuilt
import androidx.compose.material.icons.automirrored.filled.ViewSidebar
import androidx.compose.material.icons.automirrored.filled.VolumeDown
import androidx.compose.material.icons.automirrored.filled.VolumeMute
import androidx.compose.material.icons.automirrored.filled.VolumeOff
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.automirrored.filled.WrapText
import androidx.compose.material.icons.automirrored.filled.Wysiwyg
import androidx.compose.material.icons.filled.Abc
import androidx.compose.material.icons.filled.AcUnit
import androidx.compose.material.icons.filled.AccessAlarm
import androidx.compose.material.icons.filled.AccessAlarms
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.AccessTimeFilled
import androidx.compose.material.icons.filled.Accessibility
import androidx.compose.material.icons.filled.AccessibilityNew
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.material.icons.filled.AccountTree
import androidx.compose.material.icons.filled.AdUnits
import androidx.compose.material.icons.filled.Adb
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material.icons.filled.AddAlarm
import androidx.compose.material.icons.filled.AddAlert
import androidx.compose.material.icons.filled.AddBox
import androidx.compose.material.icons.filled.AddBusiness
import androidx.compose.material.icons.filled.AddCard
import androidx.compose.material.icons.filled.AddChart
import androidx.compose.material.icons.filled.AddCircleOutline
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material.icons.filled.AddHome
import androidx.compose.material.icons.filled.AddHomeWork
import androidx.compose.material.icons.filled.AddIcCall
import androidx.compose.material.icons.filled.AddLink
import androidx.compose.material.icons.filled.AddLocation
import androidx.compose.material.icons.filled.AddLocationAlt
import androidx.compose.material.icons.filled.AddModerator
import androidx.compose.material.icons.filled.AddPhotoAlternate
import androidx.compose.material.icons.filled.AddReaction
import androidx.compose.material.icons.filled.AddRoad
import androidx.compose.material.icons.filled.AddShoppingCart
import androidx.compose.material.icons.filled.AddTask
import androidx.compose.material.icons.filled.AddToDrive
import androidx.compose.material.icons.filled.AddToPhotos
import androidx.compose.material.icons.filled.AddToQueue
import androidx.compose.material.icons.filled.AdfScanner
import androidx.compose.material.icons.filled.Adjust
import androidx.compose.material.icons.filled.AdminPanelSettings
import androidx.compose.material.icons.filled.AdsClick
import androidx.compose.material.icons.filled.Agriculture
import androidx.compose.material.icons.filled.Air
import androidx.compose.material.icons.filled.AirlineSeatFlat
import androidx.compose.material.icons.filled.AirlineSeatFlatAngled
import androidx.compose.material.icons.filled.AirlineSeatIndividualSuite
import androidx.compose.material.icons.filled.AirlineSeatLegroomExtra
import androidx.compose.material.icons.filled.AirlineSeatLegroomNormal
import androidx.compose.material.icons.filled.AirlineSeatLegroomReduced
import androidx.compose.material.icons.filled.AirlineSeatReclineExtra
import androidx.compose.material.icons.filled.AirlineSeatReclineNormal
import androidx.compose.material.icons.filled.AirlineStops
import androidx.compose.material.icons.filled.Airlines
import androidx.compose.material.icons.filled.AirplanemodeActive
import androidx.compose.material.icons.filled.AirplanemodeInactive
import androidx.compose.material.icons.filled.Airplay
import androidx.compose.material.icons.filled.AirportShuttle
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.material.icons.filled.AlarmAdd
import androidx.compose.material.icons.filled.AlarmOff
import androidx.compose.material.icons.filled.AlarmOn
import androidx.compose.material.icons.filled.Album
import androidx.compose.material.icons.filled.AlignHorizontalCenter
import androidx.compose.material.icons.filled.AlignVerticalBottom
import androidx.compose.material.icons.filled.AlignVerticalCenter
import androidx.compose.material.icons.filled.AlignVerticalTop
import androidx.compose.material.icons.filled.AllInbox
import androidx.compose.material.icons.filled.AllInclusive
import androidx.compose.material.icons.filled.AllOut
import androidx.compose.material.icons.filled.AlternateEmail
import androidx.compose.material.icons.filled.AmpStories
import androidx.compose.material.icons.filled.Analytics
import androidx.compose.material.icons.filled.Anchor
import androidx.compose.material.icons.filled.Android
import androidx.compose.material.icons.filled.Animation
import androidx.compose.material.icons.filled.Aod
import androidx.compose.material.icons.filled.Apartment
import androidx.compose.material.icons.filled.Api
import androidx.compose.material.icons.filled.AppBlocking
import androidx.compose.material.icons.filled.AppRegistration
import androidx.compose.material.icons.filled.AppSettingsAlt
import androidx.compose.material.icons.filled.AppShortcut
import androidx.compose.material.icons.filled.Approval
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material.icons.filled.AppsOutage
import androidx.compose.material.icons.filled.Architecture
import androidx.compose.material.icons.filled.Archive
import androidx.compose.material.icons.filled.AreaChart
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.ArrowCircleDown
import androidx.compose.material.icons.filled.ArrowCircleLeft
import androidx.compose.material.icons.filled.ArrowCircleRight
import androidx.compose.material.icons.filled.ArrowCircleUp
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.ArrowDropDownCircle
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material.icons.filled.ArrowOutward
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.ArtTrack
import androidx.compose.material.icons.filled.AspectRatio
import androidx.compose.material.icons.filled.Assessment
import androidx.compose.material.icons.filled.AssignmentInd
import androidx.compose.material.icons.filled.AssignmentLate
import androidx.compose.material.icons.filled.AssignmentReturned
import androidx.compose.material.icons.filled.AssignmentTurnedIn
import androidx.compose.material.icons.filled.AssistWalker
import androidx.compose.material.icons.filled.Assistant
import androidx.compose.material.icons.filled.AssistantPhoto
import androidx.compose.material.icons.filled.AssuredWorkload
import androidx.compose.material.icons.filled.Atm
import androidx.compose.material.icons.filled.AttachEmail
import androidx.compose.material.icons.filled.AttachFile
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.Attachment
import androidx.compose.material.icons.filled.Attractions
import androidx.compose.material.icons.filled.Attribution
import androidx.compose.material.icons.filled.AudioFile
import androidx.compose.material.icons.filled.Audiotrack
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.AutoAwesomeMosaic
import androidx.compose.material.icons.filled.AutoAwesomeMotion
import androidx.compose.material.icons.filled.AutoDelete
import androidx.compose.material.icons.filled.AutoFixHigh
import androidx.compose.material.icons.filled.AutoFixNormal
import androidx.compose.material.icons.filled.AutoFixOff
import androidx.compose.material.icons.filled.AutoGraph
import androidx.compose.material.icons.filled.AutoMode
import androidx.compose.material.icons.filled.AutoStories
import androidx.compose.material.icons.filled.AutofpsSelect
import androidx.compose.material.icons.filled.Autorenew
import androidx.compose.material.icons.filled.AvTimer
import androidx.compose.material.icons.filled.BabyChangingStation
import androidx.compose.material.icons.filled.BackHand
import androidx.compose.material.icons.filled.Backpack
import androidx.compose.material.icons.filled.Backup
import androidx.compose.material.icons.filled.BackupTable
import androidx.compose.material.icons.filled.Badge
import androidx.compose.material.icons.filled.BakeryDining
import androidx.compose.material.icons.filled.Balance
import androidx.compose.material.icons.filled.Balcony
import androidx.compose.material.icons.filled.Ballot
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.BatchPrediction
import androidx.compose.material.icons.filled.Bathroom
import androidx.compose.material.icons.filled.Bathtub
import androidx.compose.material.icons.filled.Battery0Bar
import androidx.compose.material.icons.filled.Battery1Bar
import androidx.compose.material.icons.filled.Battery2Bar
import androidx.compose.material.icons.filled.Battery3Bar
import androidx.compose.material.icons.filled.Battery4Bar
import androidx.compose.material.icons.filled.Battery5Bar
import androidx.compose.material.icons.filled.Battery6Bar
import androidx.compose.material.icons.filled.BatteryAlert
import androidx.compose.material.icons.filled.BatteryChargingFull
import androidx.compose.material.icons.filled.BatteryFull
import androidx.compose.material.icons.filled.BatterySaver
import androidx.compose.material.icons.filled.BatteryStd
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.Bed
import androidx.compose.material.icons.filled.BedroomBaby
import androidx.compose.material.icons.filled.BedroomChild
import androidx.compose.material.icons.filled.BedroomParent
import androidx.compose.material.icons.filled.Bedtime
import androidx.compose.material.icons.filled.BedtimeOff
import androidx.compose.material.icons.filled.Beenhere
import androidx.compose.material.icons.filled.Bento
import androidx.compose.material.icons.filled.BikeScooter
import androidx.compose.material.icons.filled.Biotech
import androidx.compose.material.icons.filled.Blender
import androidx.compose.material.icons.filled.Blind
import androidx.compose.material.icons.filled.Blinds
import androidx.compose.material.icons.filled.BlindsClosed
import androidx.compose.material.icons.filled.Block
import androidx.compose.material.icons.filled.Bloodtype
import androidx.compose.material.icons.filled.Bluetooth
import androidx.compose.material.icons.filled.BluetoothAudio
import androidx.compose.material.icons.filled.BluetoothConnected
import androidx.compose.material.icons.filled.BluetoothDisabled
import androidx.compose.material.icons.filled.BluetoothDrive
import androidx.compose.material.icons.filled.BlurCircular
import androidx.compose.material.icons.filled.BlurLinear
import androidx.compose.material.icons.filled.BlurOff
import androidx.compose.material.icons.filled.BlurOn
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.BookOnline
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkAdd
import androidx.compose.material.icons.filled.BookmarkAdded
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.BookmarkRemove
import androidx.compose.material.icons.filled.Bookmarks
import androidx.compose.material.icons.filled.BorderAll
import androidx.compose.material.icons.filled.BorderBottom
import androidx.compose.material.icons.filled.BorderClear
import androidx.compose.material.icons.filled.BorderColor
import androidx.compose.material.icons.filled.BorderHorizontal
import androidx.compose.material.icons.filled.BorderInner
import androidx.compose.material.icons.filled.BorderLeft
import androidx.compose.material.icons.filled.BorderOuter
import androidx.compose.material.icons.filled.BorderRight
import androidx.compose.material.icons.filled.BorderStyle
import androidx.compose.material.icons.filled.BorderTop
import androidx.compose.material.icons.filled.BorderVertical
import androidx.compose.material.icons.filled.Boy
import androidx.compose.material.icons.filled.BreakfastDining
import androidx.compose.material.icons.filled.Brightness1
import androidx.compose.material.icons.filled.Brightness2
import androidx.compose.material.icons.filled.Brightness3
import androidx.compose.material.icons.filled.Brightness4
import androidx.compose.material.icons.filled.Brightness5
import androidx.compose.material.icons.filled.Brightness6
import androidx.compose.material.icons.filled.Brightness7
import androidx.compose.material.icons.filled.BrightnessAuto
import androidx.compose.material.icons.filled.BrightnessHigh
import androidx.compose.material.icons.filled.BrightnessLow
import androidx.compose.material.icons.filled.BrightnessMedium
import androidx.compose.material.icons.filled.BroadcastOnHome
import androidx.compose.material.icons.filled.BroadcastOnPersonal
import androidx.compose.material.icons.filled.BrokenImage
import androidx.compose.material.icons.filled.BrowseGallery
import androidx.compose.material.icons.filled.BrowserNotSupported
import androidx.compose.material.icons.filled.BrowserUpdated
import androidx.compose.material.icons.filled.BrunchDining
import androidx.compose.material.icons.filled.Brush
import androidx.compose.material.icons.filled.BubbleChart
import androidx.compose.material.icons.filled.BugReport
import androidx.compose.material.icons.filled.BuildCircle
import androidx.compose.material.icons.filled.Bungalow
import androidx.compose.material.icons.filled.BurstMode
import androidx.compose.material.icons.filled.BusAlert
import androidx.compose.material.icons.filled.Business
import androidx.compose.material.icons.filled.BusinessCenter
import androidx.compose.material.icons.filled.Cabin
import androidx.compose.material.icons.filled.Cable
import androidx.compose.material.icons.filled.Cached
import androidx.compose.material.icons.filled.Cake
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.CalendarViewDay
import androidx.compose.material.icons.filled.CalendarViewMonth
import androidx.compose.material.icons.filled.CalendarViewWeek
import androidx.compose.material.icons.filled.CallEnd
import androidx.compose.material.icons.filled.CallToAction
import androidx.compose.material.icons.filled.Camera
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.CameraEnhance
import androidx.compose.material.icons.filled.CameraFront
import androidx.compose.material.icons.filled.CameraIndoor
import androidx.compose.material.icons.filled.CameraOutdoor
import androidx.compose.material.icons.filled.CameraRear
import androidx.compose.material.icons.filled.CameraRoll
import androidx.compose.material.icons.filled.Cameraswitch
import androidx.compose.material.icons.filled.Campaign
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.CancelPresentation
import androidx.compose.material.icons.filled.CancelScheduleSend
import androidx.compose.material.icons.filled.CandlestickChart
import androidx.compose.material.icons.filled.CarCrash
import androidx.compose.material.icons.filled.CarRental
import androidx.compose.material.icons.filled.CarRepair
import androidx.compose.material.icons.filled.CardGiftcard
import androidx.compose.material.icons.filled.CardMembership
import androidx.compose.material.icons.filled.CardTravel
import androidx.compose.material.icons.filled.Carpenter
import androidx.compose.material.icons.filled.Cases
import androidx.compose.material.icons.filled.Casino
import androidx.compose.material.icons.filled.Cast
import androidx.compose.material.icons.filled.CastConnected
import androidx.compose.material.icons.filled.CastForEducation
import androidx.compose.material.icons.filled.Castle
import androidx.compose.material.icons.filled.CatchingPokemon
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.Celebration
import androidx.compose.material.icons.filled.CellTower
import androidx.compose.material.icons.filled.CellWifi
import androidx.compose.material.icons.filled.CenterFocusStrong
import androidx.compose.material.icons.filled.CenterFocusWeak
import androidx.compose.material.icons.filled.Chair
import androidx.compose.material.icons.filled.ChairAlt
import androidx.compose.material.icons.filled.Chalet
import androidx.compose.material.icons.filled.ChangeCircle
import androidx.compose.material.icons.filled.ChangeHistory
import androidx.compose.material.icons.filled.ChargingStation
import androidx.compose.material.icons.filled.ChatBubble
import androidx.compose.material.icons.filled.ChatBubbleOutline
import androidx.compose.material.icons.filled.CheckBox
import androidx.compose.material.icons.filled.CheckBoxOutlineBlank
import androidx.compose.material.icons.filled.CheckCircleOutline
import androidx.compose.material.icons.filled.Checklist
import androidx.compose.material.icons.filled.ChecklistRtl
import androidx.compose.material.icons.filled.Checkroom
import androidx.compose.material.icons.filled.ChevronLeft
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.ChildCare
import androidx.compose.material.icons.filled.ChildFriendly
import androidx.compose.material.icons.filled.Church
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.filled.CircleNotifications
import androidx.compose.material.icons.filled.Class
import androidx.compose.material.icons.filled.CleanHands
import androidx.compose.material.icons.filled.CleaningServices
import androidx.compose.material.icons.filled.ClearAll
import androidx.compose.material.icons.filled.CloseFullscreen
import androidx.compose.material.icons.filled.ClosedCaption
import androidx.compose.material.icons.filled.ClosedCaptionDisabled
import androidx.compose.material.icons.filled.ClosedCaptionOff
import androidx.compose.material.icons.filled.Cloud
import androidx.compose.material.icons.filled.CloudCircle
import androidx.compose.material.icons.filled.CloudDone
import androidx.compose.material.icons.filled.CloudDownload
import androidx.compose.material.icons.filled.CloudOff
import androidx.compose.material.icons.filled.CloudQueue
import androidx.compose.material.icons.filled.CloudSync
import androidx.compose.material.icons.filled.CloudUpload
import androidx.compose.material.icons.filled.Co2
import androidx.compose.material.icons.filled.CoPresent
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.CodeOff
import androidx.compose.material.icons.filled.Coffee
import androidx.compose.material.icons.filled.CoffeeMaker
import androidx.compose.material.icons.filled.Collections
import androidx.compose.material.icons.filled.CollectionsBookmark
import androidx.compose.material.icons.filled.ColorLens
import androidx.compose.material.icons.filled.Colorize
import androidx.compose.material.icons.filled.CommentBank
import androidx.compose.material.icons.filled.CommentsDisabled
import androidx.compose.material.icons.filled.Commit
import androidx.compose.material.icons.filled.Commute
import androidx.compose.material.icons.filled.Compare
import androidx.compose.material.icons.filled.CompassCalibration
import androidx.compose.material.icons.filled.Compost
import androidx.compose.material.icons.filled.Compress
import androidx.compose.material.icons.filled.Computer
import androidx.compose.material.icons.filled.ConfirmationNumber
import androidx.compose.material.icons.filled.ConnectWithoutContact
import androidx.compose.material.icons.filled.ConnectedTv
import androidx.compose.material.icons.filled.ConnectingAirports
import androidx.compose.material.icons.filled.Construction
import androidx.compose.material.icons.filled.ContactEmergency
import androidx.compose.material.icons.filled.ContactMail
import androidx.compose.material.icons.filled.ContactPage
import androidx.compose.material.icons.filled.ContactPhone
import androidx.compose.material.icons.filled.Contactless
import androidx.compose.material.icons.filled.Contacts
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.ContentCut
import androidx.compose.material.icons.filled.ContentPaste
import androidx.compose.material.icons.filled.ContentPasteGo
import androidx.compose.material.icons.filled.ContentPasteOff
import androidx.compose.material.icons.filled.ContentPasteSearch
import androidx.compose.material.icons.filled.Contrast
import androidx.compose.material.icons.filled.ControlCamera
import androidx.compose.material.icons.filled.ControlPoint
import androidx.compose.material.icons.filled.ControlPointDuplicate
import androidx.compose.material.icons.filled.Cookie
import androidx.compose.material.icons.filled.CopyAll
import androidx.compose.material.icons.filled.Copyright
import androidx.compose.material.icons.filled.Coronavirus
import androidx.compose.material.icons.filled.CorporateFare
import androidx.compose.material.icons.filled.Cottage
import androidx.compose.material.icons.filled.Countertops
import androidx.compose.material.icons.filled.CreateNewFolder
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material.icons.filled.CreditCardOff
import androidx.compose.material.icons.filled.CreditScore
import androidx.compose.material.icons.filled.Crib
import androidx.compose.material.icons.filled.CrisisAlert
import androidx.compose.material.icons.filled.Crop
import androidx.compose.material.icons.filled.Crop169
import androidx.compose.material.icons.filled.Crop32
import androidx.compose.material.icons.filled.Crop54
import androidx.compose.material.icons.filled.Crop75
import androidx.compose.material.icons.filled.CropDin
import androidx.compose.material.icons.filled.CropFree
import androidx.compose.material.icons.filled.CropLandscape
import androidx.compose.material.icons.filled.CropOriginal
import androidx.compose.material.icons.filled.CropPortrait
import androidx.compose.material.icons.filled.CropRotate
import androidx.compose.material.icons.filled.CropSquare
import androidx.compose.material.icons.filled.CrueltyFree
import androidx.compose.material.icons.filled.Css
import androidx.compose.material.icons.filled.CurrencyBitcoin
import androidx.compose.material.icons.filled.CurrencyExchange
import androidx.compose.material.icons.filled.CurrencyFranc
import androidx.compose.material.icons.filled.CurrencyLira
import androidx.compose.material.icons.filled.CurrencyPound
import androidx.compose.material.icons.filled.CurrencyRuble
import androidx.compose.material.icons.filled.CurrencyRupee
import androidx.compose.material.icons.filled.CurrencyYen
import androidx.compose.material.icons.filled.CurrencyYuan
import androidx.compose.material.icons.filled.Curtains
import androidx.compose.material.icons.filled.CurtainsClosed
import androidx.compose.material.icons.filled.Cyclone
import androidx.compose.material.icons.filled.Dangerous
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.DashboardCustomize
import androidx.compose.material.icons.filled.DataArray
import androidx.compose.material.icons.filled.DataExploration
import androidx.compose.material.icons.filled.DataObject
import androidx.compose.material.icons.filled.DataSaverOff
import androidx.compose.material.icons.filled.DataSaverOn
import androidx.compose.material.icons.filled.DataThresholding
import androidx.compose.material.icons.filled.DataUsage
import androidx.compose.material.icons.filled.Dataset
import androidx.compose.material.icons.filled.DatasetLinked
import androidx.compose.material.icons.filled.Deblur
import androidx.compose.material.icons.filled.Deck
import androidx.compose.material.icons.filled.Dehaze
import androidx.compose.material.icons.filled.DeleteForever
import androidx.compose.material.icons.filled.DeleteOutline
import androidx.compose.material.icons.filled.DeleteSweep
import androidx.compose.material.icons.filled.DeliveryDining
import androidx.compose.material.icons.filled.DensityLarge
import androidx.compose.material.icons.filled.DensityMedium
import androidx.compose.material.icons.filled.DensitySmall
import androidx.compose.material.icons.filled.DepartureBoard
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Deselect
import androidx.compose.material.icons.filled.DesignServices
import androidx.compose.material.icons.filled.Desk
import androidx.compose.material.icons.filled.DesktopAccessDisabled
import androidx.compose.material.icons.filled.DesktopMac
import androidx.compose.material.icons.filled.DesktopWindows
import androidx.compose.material.icons.filled.Details
import androidx.compose.material.icons.filled.DeveloperBoard
import androidx.compose.material.icons.filled.DeveloperBoardOff
import androidx.compose.material.icons.filled.DeveloperMode
import androidx.compose.material.icons.filled.DeviceHub
import androidx.compose.material.icons.filled.DeviceThermostat
import androidx.compose.material.icons.filled.DeviceUnknown
import androidx.compose.material.icons.filled.Devices
import androidx.compose.material.icons.filled.DevicesFold
import androidx.compose.material.icons.filled.DevicesOther
import androidx.compose.material.icons.filled.DialerSip
import androidx.compose.material.icons.filled.Dialpad
import androidx.compose.material.icons.filled.Diamond
import androidx.compose.material.icons.filled.Difference
import androidx.compose.material.icons.filled.Dining
import androidx.compose.material.icons.filled.DinnerDining
import androidx.compose.material.icons.filled.Directions
import androidx.compose.material.icons.filled.DirectionsBoat
import androidx.compose.material.icons.filled.DirectionsBoatFilled
import androidx.compose.material.icons.filled.DirectionsBus
import androidx.compose.material.icons.filled.DirectionsBusFilled
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.DirectionsCarFilled
import androidx.compose.material.icons.filled.DirectionsOff
import androidx.compose.material.icons.filled.DirectionsRailway
import androidx.compose.material.icons.filled.DirectionsRailwayFilled
import androidx.compose.material.icons.filled.DirectionsSubway
import androidx.compose.material.icons.filled.DirectionsSubwayFilled
import androidx.compose.material.icons.filled.DirectionsTransit
import androidx.compose.material.icons.filled.DirectionsTransitFilled
import androidx.compose.material.icons.filled.DirtyLens
import androidx.compose.material.icons.filled.DisabledByDefault
import androidx.compose.material.icons.filled.DisabledVisible
import androidx.compose.material.icons.filled.DiscFull
import androidx.compose.material.icons.filled.Discount
import androidx.compose.material.icons.filled.DisplaySettings
import androidx.compose.material.icons.filled.Diversity1
import androidx.compose.material.icons.filled.Diversity2
import androidx.compose.material.icons.filled.Diversity3
import androidx.compose.material.icons.filled.Dns
import androidx.compose.material.icons.filled.DoDisturb
import androidx.compose.material.icons.filled.DoDisturbAlt
import androidx.compose.material.icons.filled.DoDisturbOff
import androidx.compose.material.icons.filled.DoDisturbOn
import androidx.compose.material.icons.filled.DoNotDisturb
import androidx.compose.material.icons.filled.DoNotDisturbAlt
import androidx.compose.material.icons.filled.DoNotDisturbOff
import androidx.compose.material.icons.filled.DoNotDisturbOn
import androidx.compose.material.icons.filled.DoNotDisturbOnTotalSilence
import androidx.compose.material.icons.filled.DoNotStep
import androidx.compose.material.icons.filled.DoNotTouch
import androidx.compose.material.icons.filled.Dock
import androidx.compose.material.icons.filled.DocumentScanner
import androidx.compose.material.icons.filled.Domain
import androidx.compose.material.icons.filled.DomainAdd
import androidx.compose.material.icons.filled.DomainDisabled
import androidx.compose.material.icons.filled.DomainVerification
import androidx.compose.material.icons.filled.DoneAll
import androidx.compose.material.icons.filled.DoneOutline
import androidx.compose.material.icons.filled.DonutLarge
import androidx.compose.material.icons.filled.DonutSmall
import androidx.compose.material.icons.filled.DoorBack
import androidx.compose.material.icons.filled.DoorFront
import androidx.compose.material.icons.filled.DoorSliding
import androidx.compose.material.icons.filled.Doorbell
import androidx.compose.material.icons.filled.DoubleArrow
import androidx.compose.material.icons.filled.DownhillSkiing
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.DownloadDone
import androidx.compose.material.icons.filled.DownloadForOffline
import androidx.compose.material.icons.filled.Downloading
import androidx.compose.material.icons.filled.Drafts
import androidx.compose.material.icons.filled.DragHandle
import androidx.compose.material.icons.filled.DragIndicator
import androidx.compose.material.icons.filled.Draw
import androidx.compose.material.icons.filled.DriveEta
import androidx.compose.material.icons.filled.DriveFileMoveRtl
import androidx.compose.material.icons.filled.DriveFileRenameOutline
import androidx.compose.material.icons.filled.DriveFolderUpload
import androidx.compose.material.icons.filled.Dry
import androidx.compose.material.icons.filled.DryCleaning
import androidx.compose.material.icons.filled.Duo
import androidx.compose.material.icons.filled.DynamicFeed
import androidx.compose.material.icons.filled.DynamicForm
import androidx.compose.material.icons.filled.EMobiledata
import androidx.compose.material.icons.filled.Earbuds
import androidx.compose.material.icons.filled.EarbudsBattery
import androidx.compose.material.icons.filled.East
import androidx.compose.material.icons.filled.Eco
import androidx.compose.material.icons.filled.EdgesensorHigh
import androidx.compose.material.icons.filled.EdgesensorLow
import androidx.compose.material.icons.filled.EditAttributes
import androidx.compose.material.icons.filled.EditCalendar
import androidx.compose.material.icons.filled.EditLocation
import androidx.compose.material.icons.filled.EditLocationAlt
import androidx.compose.material.icons.filled.EditNote
import androidx.compose.material.icons.filled.EditNotifications
import androidx.compose.material.icons.filled.EditOff
import androidx.compose.material.icons.filled.EditRoad
import androidx.compose.material.icons.filled.Egg
import androidx.compose.material.icons.filled.EggAlt
import androidx.compose.material.icons.filled.Eject
import androidx.compose.material.icons.filled.Elderly
import androidx.compose.material.icons.filled.ElderlyWoman
import androidx.compose.material.icons.filled.ElectricBike
import androidx.compose.material.icons.filled.ElectricBolt
import androidx.compose.material.icons.filled.ElectricCar
import androidx.compose.material.icons.filled.ElectricMeter
import androidx.compose.material.icons.filled.ElectricMoped
import androidx.compose.material.icons.filled.ElectricRickshaw
import androidx.compose.material.icons.filled.ElectricScooter
import androidx.compose.material.icons.filled.ElectricalServices
import androidx.compose.material.icons.filled.Elevator
import androidx.compose.material.icons.filled.Emergency
import androidx.compose.material.icons.filled.EmergencyRecording
import androidx.compose.material.icons.filled.EmergencyShare
import androidx.compose.material.icons.filled.EmojiEmotions
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.EmojiFlags
import androidx.compose.material.icons.filled.EmojiFoodBeverage
import androidx.compose.material.icons.filled.EmojiNature
import androidx.compose.material.icons.filled.EmojiObjects
import androidx.compose.material.icons.filled.EmojiPeople
import androidx.compose.material.icons.filled.EmojiSymbols
import androidx.compose.material.icons.filled.EmojiTransportation
import androidx.compose.material.icons.filled.EnergySavingsLeaf
import androidx.compose.material.icons.filled.Engineering
import androidx.compose.material.icons.filled.EnhancedEncryption
import androidx.compose.material.icons.filled.Equalizer
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.ErrorOutline
import androidx.compose.material.icons.filled.Escalator
import androidx.compose.material.icons.filled.EscalatorWarning
import androidx.compose.material.icons.filled.Euro
import androidx.compose.material.icons.filled.EuroSymbol
import androidx.compose.material.icons.filled.EvStation
import androidx.compose.material.icons.filled.Event
import androidx.compose.material.icons.filled.EventAvailable
import androidx.compose.material.icons.filled.EventBusy
import androidx.compose.material.icons.filled.EventRepeat
import androidx.compose.material.icons.filled.EventSeat
import androidx.compose.material.icons.filled.Expand
import androidx.compose.material.icons.filled.ExpandCircleDown
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Explicit
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.ExploreOff
import androidx.compose.material.icons.filled.Exposure
import androidx.compose.material.icons.filled.ExposureNeg1
import androidx.compose.material.icons.filled.ExposureNeg2
import androidx.compose.material.icons.filled.ExposurePlus1
import androidx.compose.material.icons.filled.ExposurePlus2
import androidx.compose.material.icons.filled.ExposureZero
import androidx.compose.material.icons.filled.Extension
import androidx.compose.material.icons.filled.ExtensionOff
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Face2
import androidx.compose.material.icons.filled.Face3
import androidx.compose.material.icons.filled.Face4
import androidx.compose.material.icons.filled.Face5
import androidx.compose.material.icons.filled.Face6
import androidx.compose.material.icons.filled.FaceRetouchingNatural
import androidx.compose.material.icons.filled.FaceRetouchingOff
import androidx.compose.material.icons.filled.Facebook
import androidx.compose.material.icons.filled.Factory
import androidx.compose.material.icons.filled.FamilyRestroom
import androidx.compose.material.icons.filled.FastForward
import androidx.compose.material.icons.filled.FastRewind
import androidx.compose.material.icons.filled.Fastfood
import androidx.compose.material.icons.filled.Fax
import androidx.compose.material.icons.filled.Feedback
import androidx.compose.material.icons.filled.Female
import androidx.compose.material.icons.filled.Fence
import androidx.compose.material.icons.filled.Festival
import androidx.compose.material.icons.filled.FiberDvr
import androidx.compose.material.icons.filled.FiberManualRecord
import androidx.compose.material.icons.filled.FiberNew
import androidx.compose.material.icons.filled.FiberPin
import androidx.compose.material.icons.filled.FiberSmartRecord
import androidx.compose.material.icons.filled.FileCopy
import androidx.compose.material.icons.filled.FileDownload
import androidx.compose.material.icons.filled.FileDownloadDone
import androidx.compose.material.icons.filled.FileDownloadOff
import androidx.compose.material.icons.filled.FileOpen
import androidx.compose.material.icons.filled.FilePresent
import androidx.compose.material.icons.filled.FileUpload
import androidx.compose.material.icons.filled.Filter
import androidx.compose.material.icons.filled.Filter1
import androidx.compose.material.icons.filled.Filter2
import androidx.compose.material.icons.filled.Filter3
import androidx.compose.material.icons.filled.Filter4
import androidx.compose.material.icons.filled.Filter5
import androidx.compose.material.icons.filled.Filter6
import androidx.compose.material.icons.filled.Filter7
import androidx.compose.material.icons.filled.Filter8
import androidx.compose.material.icons.filled.Filter9
import androidx.compose.material.icons.filled.Filter9Plus
import androidx.compose.material.icons.filled.FilterAlt
import androidx.compose.material.icons.filled.FilterAltOff
import androidx.compose.material.icons.filled.FilterBAndW
import androidx.compose.material.icons.filled.FilterCenterFocus
import androidx.compose.material.icons.filled.FilterDrama
import androidx.compose.material.icons.filled.FilterFrames
import androidx.compose.material.icons.filled.FilterHdr
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.FilterListOff
import androidx.compose.material.icons.filled.FilterNone
import androidx.compose.material.icons.filled.FilterTiltShift
import androidx.compose.material.icons.filled.FilterVintage
import androidx.compose.material.icons.filled.FindInPage
import androidx.compose.material.icons.filled.FindReplace
import androidx.compose.material.icons.filled.Fingerprint
import androidx.compose.material.icons.filled.FireExtinguisher
import androidx.compose.material.icons.filled.FireHydrantAlt
import androidx.compose.material.icons.filled.FireTruck
import androidx.compose.material.icons.filled.Fireplace
import androidx.compose.material.icons.filled.FirstPage
import androidx.compose.material.icons.filled.FitScreen
import androidx.compose.material.icons.filled.Fitbit
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.Flag
import androidx.compose.material.icons.filled.FlagCircle
import androidx.compose.material.icons.filled.Flaky
import androidx.compose.material.icons.filled.Flare
import androidx.compose.material.icons.filled.FlashAuto
import androidx.compose.material.icons.filled.FlashOff
import androidx.compose.material.icons.filled.FlashOn
import androidx.compose.material.icons.filled.FlashlightOff
import androidx.compose.material.icons.filled.FlashlightOn
import androidx.compose.material.icons.filled.Flatware
import androidx.compose.material.icons.filled.Flight
import androidx.compose.material.icons.filled.FlightClass
import androidx.compose.material.icons.filled.FlightLand
import androidx.compose.material.icons.filled.FlightTakeoff
import androidx.compose.material.icons.filled.Flip
import androidx.compose.material.icons.filled.FlipCameraAndroid
import androidx.compose.material.icons.filled.FlipCameraIos
import androidx.compose.material.icons.filled.FlipToBack
import androidx.compose.material.icons.filled.FlipToFront
import androidx.compose.material.icons.filled.Flood
import androidx.compose.material.icons.filled.Flourescent
import androidx.compose.material.icons.filled.Fluorescent
import androidx.compose.material.icons.filled.FlutterDash
import androidx.compose.material.icons.filled.FmdBad
import androidx.compose.material.icons.filled.FmdGood
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.FolderCopy
import androidx.compose.material.icons.filled.FolderDelete
import androidx.compose.material.icons.filled.FolderOff
import androidx.compose.material.icons.filled.FolderOpen
import androidx.compose.material.icons.filled.FolderShared
import androidx.compose.material.icons.filled.FolderSpecial
import androidx.compose.material.icons.filled.FolderZip
import androidx.compose.material.icons.filled.FontDownload
import androidx.compose.material.icons.filled.FontDownloadOff
import androidx.compose.material.icons.filled.FoodBank
import androidx.compose.material.icons.filled.Forest
import androidx.compose.material.icons.filled.ForkLeft
import androidx.compose.material.icons.filled.ForkRight
import androidx.compose.material.icons.filled.FormatAlignCenter
import androidx.compose.material.icons.filled.FormatAlignJustify
import androidx.compose.material.icons.filled.FormatBold
import androidx.compose.material.icons.filled.FormatClear
import androidx.compose.material.icons.filled.FormatColorFill
import androidx.compose.material.icons.filled.FormatColorReset
import androidx.compose.material.icons.filled.FormatColorText
import androidx.compose.material.icons.filled.FormatItalic
import androidx.compose.material.icons.filled.FormatLineSpacing
import androidx.compose.material.icons.filled.FormatListNumbered
import androidx.compose.material.icons.filled.FormatListNumberedRtl
import androidx.compose.material.icons.filled.FormatOverline
import androidx.compose.material.icons.filled.FormatPaint
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material.icons.filled.FormatShapes
import androidx.compose.material.icons.filled.FormatSize
import androidx.compose.material.icons.filled.FormatStrikethrough
import androidx.compose.material.icons.filled.FormatUnderlined
import androidx.compose.material.icons.filled.Fort
import androidx.compose.material.icons.filled.Forum
import androidx.compose.material.icons.filled.Forward10
import androidx.compose.material.icons.filled.Forward30
import androidx.compose.material.icons.filled.Forward5
import androidx.compose.material.icons.filled.Foundation
import androidx.compose.material.icons.filled.FreeBreakfast
import androidx.compose.material.icons.filled.FreeCancellation
import androidx.compose.material.icons.filled.FrontHand
import androidx.compose.material.icons.filled.Fullscreen
import androidx.compose.material.icons.filled.FullscreenExit
import androidx.compose.material.icons.filled.Functions
import androidx.compose.material.icons.filled.GMobiledata
import androidx.compose.material.icons.filled.GTranslate
import androidx.compose.material.icons.filled.Gamepad
import androidx.compose.material.icons.filled.Games
import androidx.compose.material.icons.filled.Garage
import androidx.compose.material.icons.filled.GasMeter
import androidx.compose.material.icons.filled.Gavel
import androidx.compose.material.icons.filled.GeneratingTokens
import androidx.compose.material.icons.filled.Gesture
import androidx.compose.material.icons.filled.GetApp
import androidx.compose.material.icons.filled.Gif
import androidx.compose.material.icons.filled.GifBox
import androidx.compose.material.icons.filled.Girl
import androidx.compose.material.icons.filled.Gite
import androidx.compose.material.icons.filled.GolfCourse
import androidx.compose.material.icons.filled.GppBad
import androidx.compose.material.icons.filled.GppGood
import androidx.compose.material.icons.filled.GppMaybe
import androidx.compose.material.icons.filled.GpsFixed
import androidx.compose.material.icons.filled.GpsNotFixed
import androidx.compose.material.icons.filled.GpsOff
import androidx.compose.material.icons.filled.Grade
import androidx.compose.material.icons.filled.Gradient
import androidx.compose.material.icons.filled.Grain
import androidx.compose.material.icons.filled.GraphicEq
import androidx.compose.material.icons.filled.Grass
import androidx.compose.material.icons.filled.Grid3x3
import androidx.compose.material.icons.filled.Grid4x4
import androidx.compose.material.icons.filled.GridGoldenratio
import androidx.compose.material.icons.filled.GridOff
import androidx.compose.material.icons.filled.GridOn
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.filled.Group
import androidx.compose.material.icons.filled.GroupAdd
import androidx.compose.material.icons.filled.GroupOff
import androidx.compose.material.icons.filled.GroupRemove
import androidx.compose.material.icons.filled.GroupWork
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.Groups2
import androidx.compose.material.icons.filled.Groups3
import androidx.compose.material.icons.filled.HMobiledata
import androidx.compose.material.icons.filled.HPlusMobiledata
import androidx.compose.material.icons.filled.Hail
import androidx.compose.material.icons.filled.Handshake
import androidx.compose.material.icons.filled.Handyman
import androidx.compose.material.icons.filled.Hardware
import androidx.compose.material.icons.filled.Hd
import androidx.compose.material.icons.filled.HdrAuto
import androidx.compose.material.icons.filled.HdrAutoSelect
import androidx.compose.material.icons.filled.HdrEnhancedSelect
import androidx.compose.material.icons.filled.HdrOff
import androidx.compose.material.icons.filled.HdrOffSelect
import androidx.compose.material.icons.filled.HdrOn
import androidx.compose.material.icons.filled.HdrOnSelect
import androidx.compose.material.icons.filled.HdrPlus
import androidx.compose.material.icons.filled.HdrStrong
import androidx.compose.material.icons.filled.HdrWeak
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material.icons.filled.HeadphonesBattery
import androidx.compose.material.icons.filled.Headset
import androidx.compose.material.icons.filled.HeadsetMic
import androidx.compose.material.icons.filled.HeadsetOff
import androidx.compose.material.icons.filled.Healing
import androidx.compose.material.icons.filled.HealthAndSafety
import androidx.compose.material.icons.filled.Hearing
import androidx.compose.material.icons.filled.HearingDisabled
import androidx.compose.material.icons.filled.HeartBroken
import androidx.compose.material.icons.filled.HeatPump
import androidx.compose.material.icons.filled.Height
import androidx.compose.material.icons.filled.Hevc
import androidx.compose.material.icons.filled.Hexagon
import androidx.compose.material.icons.filled.HideImage
import androidx.compose.material.icons.filled.HideSource
import androidx.compose.material.icons.filled.HighQuality
import androidx.compose.material.icons.filled.Highlight
import androidx.compose.material.icons.filled.HighlightAlt
import androidx.compose.material.icons.filled.HighlightOff
import androidx.compose.material.icons.filled.Hiking
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.HistoryEdu
import androidx.compose.material.icons.filled.HistoryToggleOff
import androidx.compose.material.icons.filled.Hive
import androidx.compose.material.icons.filled.Hls
import androidx.compose.material.icons.filled.HlsOff
import androidx.compose.material.icons.filled.HolidayVillage
import androidx.compose.material.icons.filled.HomeMax
import androidx.compose.material.icons.filled.HomeMini
import androidx.compose.material.icons.filled.HomeRepairService
import androidx.compose.material.icons.filled.HomeWork
import androidx.compose.material.icons.filled.HorizontalDistribute
import androidx.compose.material.icons.filled.HorizontalRule
import androidx.compose.material.icons.filled.HorizontalSplit
import androidx.compose.material.icons.filled.HotTub
import androidx.compose.material.icons.filled.Hotel
import androidx.compose.material.icons.filled.HotelClass
import androidx.compose.material.icons.filled.HourglassBottom
import androidx.compose.material.icons.filled.HourglassDisabled
import androidx.compose.material.icons.filled.HourglassEmpty
import androidx.compose.material.icons.filled.HourglassFull
import androidx.compose.material.icons.filled.HourglassTop
import androidx.compose.material.icons.filled.House
import androidx.compose.material.icons.filled.HouseSiding
import androidx.compose.material.icons.filled.Houseboat
import androidx.compose.material.icons.filled.HowToReg
import androidx.compose.material.icons.filled.HowToVote
import androidx.compose.material.icons.filled.Html
import androidx.compose.material.icons.filled.Http
import androidx.compose.material.icons.filled.Https
import androidx.compose.material.icons.filled.Hub
import androidx.compose.material.icons.filled.Hvac
import androidx.compose.material.icons.filled.IceSkating
import androidx.compose.material.icons.filled.Icecream
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.ImageAspectRatio
import androidx.compose.material.icons.filled.ImageNotSupported
import androidx.compose.material.icons.filled.ImageSearch
import androidx.compose.material.icons.filled.ImagesearchRoller
import androidx.compose.material.icons.filled.ImportContacts
import androidx.compose.material.icons.filled.ImportExport
import androidx.compose.material.icons.filled.ImportantDevices
import androidx.compose.material.icons.filled.Inbox
import androidx.compose.material.icons.filled.IncompleteCircle
import androidx.compose.material.icons.filled.IndeterminateCheckBox
import androidx.compose.material.icons.filled.InsertChart
import androidx.compose.material.icons.filled.InsertChartOutlined
import androidx.compose.material.icons.filled.InsertEmoticon
import androidx.compose.material.icons.filled.InsertInvitation
import androidx.compose.material.icons.filled.InsertLink
import androidx.compose.material.icons.filled.InsertPageBreak
import androidx.compose.material.icons.filled.InsertPhoto
import androidx.compose.material.icons.filled.Insights
import androidx.compose.material.icons.filled.InstallDesktop
import androidx.compose.material.icons.filled.InstallMobile
import androidx.compose.material.icons.filled.IntegrationInstructions
import androidx.compose.material.icons.filled.Interests
import androidx.compose.material.icons.filled.InterpreterMode
import androidx.compose.material.icons.filled.Inventory
import androidx.compose.material.icons.filled.Inventory2
import androidx.compose.material.icons.filled.InvertColors
import androidx.compose.material.icons.filled.InvertColorsOff
import androidx.compose.material.icons.filled.IosShare
import androidx.compose.material.icons.filled.Iron
import androidx.compose.material.icons.filled.Iso
import androidx.compose.material.icons.filled.Javascript
import androidx.compose.material.icons.filled.JoinFull
import androidx.compose.material.icons.filled.JoinInner
import androidx.compose.material.icons.filled.JoinLeft
import androidx.compose.material.icons.filled.JoinRight
import androidx.compose.material.icons.filled.Kayaking
import androidx.compose.material.icons.filled.KebabDining
import androidx.compose.material.icons.filled.Key
import androidx.compose.material.icons.filled.KeyOff
import androidx.compose.material.icons.filled.Keyboard
import androidx.compose.material.icons.filled.KeyboardAlt
import androidx.compose.material.icons.filled.KeyboardCapslock
import androidx.compose.material.icons.filled.KeyboardCommandKey
import androidx.compose.material.icons.filled.KeyboardControlKey
import androidx.compose.material.icons.filled.KeyboardDoubleArrowDown
import androidx.compose.material.icons.filled.KeyboardDoubleArrowLeft
import androidx.compose.material.icons.filled.KeyboardDoubleArrowRight
import androidx.compose.material.icons.filled.KeyboardDoubleArrowUp
import androidx.compose.material.icons.filled.KeyboardHide
import androidx.compose.material.icons.filled.KeyboardOptionKey
import androidx.compose.material.icons.filled.KeyboardVoice
import androidx.compose.material.icons.filled.KingBed
import androidx.compose.material.icons.filled.Kitchen
import androidx.compose.material.icons.filled.Kitesurfing
import androidx.compose.material.icons.filled.Lan
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.Landslide
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Laptop
import androidx.compose.material.icons.filled.LaptopChromebook
import androidx.compose.material.icons.filled.LaptopMac
import androidx.compose.material.icons.filled.LaptopWindows
import androidx.compose.material.icons.filled.Layers
import androidx.compose.material.icons.filled.LayersClear
import androidx.compose.material.icons.filled.Leaderboard
import androidx.compose.material.icons.filled.LeakAdd
import androidx.compose.material.icons.filled.LeakRemove
import androidx.compose.material.icons.filled.LeaveBagsAtHome
import androidx.compose.material.icons.filled.LegendToggle
import androidx.compose.material.icons.filled.Lens
import androidx.compose.material.icons.filled.LensBlur
import androidx.compose.material.icons.filled.LibraryAdd
import androidx.compose.material.icons.filled.LibraryAddCheck
import androidx.compose.material.icons.filled.LibraryMusic
import androidx.compose.material.icons.filled.Light
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.LightbulbCircle
import androidx.compose.material.icons.filled.LineAxis
import androidx.compose.material.icons.filled.LineStyle
import androidx.compose.material.icons.filled.LineWeight
import androidx.compose.material.icons.filled.LinearScale
import androidx.compose.material.icons.filled.Link
import androidx.compose.material.icons.filled.LinkOff
import androidx.compose.material.icons.filled.LinkedCamera
import androidx.compose.material.icons.filled.Liquor
import androidx.compose.material.icons.filled.LiveTv
import androidx.compose.material.icons.filled.Living
import androidx.compose.material.icons.filled.LocalActivity
import androidx.compose.material.icons.filled.LocalAirport
import androidx.compose.material.icons.filled.LocalAtm
import androidx.compose.material.icons.filled.LocalBar
import androidx.compose.material.icons.filled.LocalCafe
import androidx.compose.material.icons.filled.LocalCarWash
import androidx.compose.material.icons.filled.LocalConvenienceStore
import androidx.compose.material.icons.filled.LocalDining
import androidx.compose.material.icons.filled.LocalDrink
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.LocalFlorist
import androidx.compose.material.icons.filled.LocalGasStation
import androidx.compose.material.icons.filled.LocalGroceryStore
import androidx.compose.material.icons.filled.LocalHospital
import androidx.compose.material.icons.filled.LocalHotel
import androidx.compose.material.icons.filled.LocalLaundryService
import androidx.compose.material.icons.filled.LocalLibrary
import androidx.compose.material.icons.filled.LocalMall
import androidx.compose.material.icons.filled.LocalMovies
import androidx.compose.material.icons.filled.LocalOffer
import androidx.compose.material.icons.filled.LocalParking
import androidx.compose.material.icons.filled.LocalPharmacy
import androidx.compose.material.icons.filled.LocalPhone
import androidx.compose.material.icons.filled.LocalPizza
import androidx.compose.material.icons.filled.LocalPlay
import androidx.compose.material.icons.filled.LocalPolice
import androidx.compose.material.icons.filled.LocalPostOffice
import androidx.compose.material.icons.filled.LocalPrintshop
import androidx.compose.material.icons.filled.LocalSee
import androidx.compose.material.icons.filled.LocalShipping
import androidx.compose.material.icons.filled.LocalTaxi
import androidx.compose.material.icons.filled.LocationCity
import androidx.compose.material.icons.filled.LocationDisabled
import androidx.compose.material.icons.filled.LocationOff
import androidx.compose.material.icons.filled.LocationSearching
import androidx.compose.material.icons.filled.LockClock
import androidx.compose.material.icons.filled.LockOpen
import androidx.compose.material.icons.filled.LockPerson
import androidx.compose.material.icons.filled.LockReset
import androidx.compose.material.icons.filled.LogoDev
import androidx.compose.material.icons.filled.Looks
import androidx.compose.material.icons.filled.Looks3
import androidx.compose.material.icons.filled.Looks4
import androidx.compose.material.icons.filled.Looks5
import androidx.compose.material.icons.filled.Looks6
import androidx.compose.material.icons.filled.LooksOne
import androidx.compose.material.icons.filled.LooksTwo
import androidx.compose.material.icons.filled.Loop
import androidx.compose.material.icons.filled.Loupe
import androidx.compose.material.icons.filled.LowPriority
import androidx.compose.material.icons.filled.Loyalty
import androidx.compose.material.icons.filled.LteMobiledata
import androidx.compose.material.icons.filled.LtePlusMobiledata
import androidx.compose.material.icons.filled.Luggage
import androidx.compose.material.icons.filled.LunchDining
import androidx.compose.material.icons.filled.Lyrics
import androidx.compose.material.icons.filled.MacroOff
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.MailLock
import androidx.compose.material.icons.filled.Male
import androidx.compose.material.icons.filled.Man
import androidx.compose.material.icons.filled.Man2
import androidx.compose.material.icons.filled.Man3
import androidx.compose.material.icons.filled.Man4
import androidx.compose.material.icons.filled.ManageAccounts
import androidx.compose.material.icons.filled.ManageHistory
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.MapsHomeWork
import androidx.compose.material.icons.filled.MapsUgc
import androidx.compose.material.icons.filled.Margin
import androidx.compose.material.icons.filled.MarkAsUnread
import androidx.compose.material.icons.filled.MarkChatRead
import androidx.compose.material.icons.filled.MarkChatUnread
import androidx.compose.material.icons.filled.MarkEmailRead
import androidx.compose.material.icons.filled.MarkEmailUnread
import androidx.compose.material.icons.filled.MarkUnreadChatAlt
import androidx.compose.material.icons.filled.Markunread
import androidx.compose.material.icons.filled.MarkunreadMailbox
import androidx.compose.material.icons.filled.Masks
import androidx.compose.material.icons.filled.Maximize
import androidx.compose.material.icons.filled.MediaBluetoothOff
import androidx.compose.material.icons.filled.MediaBluetoothOn
import androidx.compose.material.icons.filled.Mediation
import androidx.compose.material.icons.filled.MedicalInformation
import androidx.compose.material.icons.filled.MedicalServices
import androidx.compose.material.icons.filled.Medication
import androidx.compose.material.icons.filled.MeetingRoom
import androidx.compose.material.icons.filled.Memory
import androidx.compose.material.icons.filled.Merge
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.MicExternalOff
import androidx.compose.material.icons.filled.MicExternalOn
import androidx.compose.material.icons.filled.MicNone
import androidx.compose.material.icons.filled.MicOff
import androidx.compose.material.icons.filled.Microwave
import androidx.compose.material.icons.filled.MilitaryTech
import androidx.compose.material.icons.filled.Minimize
import androidx.compose.material.icons.filled.MinorCrash
import androidx.compose.material.icons.filled.MiscellaneousServices
import androidx.compose.material.icons.filled.Mms
import androidx.compose.material.icons.filled.MobileFriendly
import androidx.compose.material.icons.filled.MobileOff
import androidx.compose.material.icons.filled.MobiledataOff
import androidx.compose.material.icons.filled.Mode
import androidx.compose.material.icons.filled.ModeComment
import androidx.compose.material.icons.filled.ModeEdit
import androidx.compose.material.icons.filled.ModeEditOutline
import androidx.compose.material.icons.filled.ModeFanOff
import androidx.compose.material.icons.filled.ModeNight
import androidx.compose.material.icons.filled.ModeOfTravel
import androidx.compose.material.icons.filled.ModeStandby
import androidx.compose.material.icons.filled.ModelTraining
import androidx.compose.material.icons.filled.MonetizationOn
import androidx.compose.material.icons.filled.Money
import androidx.compose.material.icons.filled.MoneyOff
import androidx.compose.material.icons.filled.MoneyOffCsred
import androidx.compose.material.icons.filled.Monitor
import androidx.compose.material.icons.filled.MonitorHeart
import androidx.compose.material.icons.filled.MonitorWeight
import androidx.compose.material.icons.filled.MonochromePhotos
import androidx.compose.material.icons.filled.Mood
import androidx.compose.material.icons.filled.MoodBad
import androidx.compose.material.icons.filled.Moped
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.filled.MoreTime
import androidx.compose.material.icons.filled.Mosque
import androidx.compose.material.icons.filled.MotionPhotosAuto
import androidx.compose.material.icons.filled.MotionPhotosOff
import androidx.compose.material.icons.filled.MotionPhotosOn
import androidx.compose.material.icons.filled.MotionPhotosPause
import androidx.compose.material.icons.filled.MotionPhotosPaused
import androidx.compose.material.icons.filled.Motorcycle
import androidx.compose.material.icons.filled.Mouse
import androidx.compose.material.icons.filled.MoveDown
import androidx.compose.material.icons.filled.MoveToInbox
import androidx.compose.material.icons.filled.MoveUp
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.MovieCreation
import androidx.compose.material.icons.filled.MovieFilter
import androidx.compose.material.icons.filled.Moving
import androidx.compose.material.icons.filled.Mp
import androidx.compose.material.icons.filled.MultipleStop
import androidx.compose.material.icons.filled.Museum
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.MusicOff
import androidx.compose.material.icons.filled.MusicVideo
import androidx.compose.material.icons.filled.MyLocation
import androidx.compose.material.icons.filled.Nat
import androidx.compose.material.icons.filled.Nature
import androidx.compose.material.icons.filled.NaturePeople
import androidx.compose.material.icons.filled.Navigation
import androidx.compose.material.icons.filled.NearMe
import androidx.compose.material.icons.filled.NearMeDisabled
import androidx.compose.material.icons.filled.NearbyError
import androidx.compose.material.icons.filled.NearbyOff
import androidx.compose.material.icons.filled.NestCamWiredStand
import androidx.compose.material.icons.filled.NetworkCell
import androidx.compose.material.icons.filled.NetworkCheck
import androidx.compose.material.icons.filled.NetworkLocked
import androidx.compose.material.icons.filled.NetworkPing
import androidx.compose.material.icons.filled.NetworkWifi
import androidx.compose.material.icons.filled.NetworkWifi1Bar
import androidx.compose.material.icons.filled.NetworkWifi2Bar
import androidx.compose.material.icons.filled.NetworkWifi3Bar
import androidx.compose.material.icons.filled.NewLabel
import androidx.compose.material.icons.filled.NewReleases
import androidx.compose.material.icons.filled.Newspaper
import androidx.compose.material.icons.filled.Nfc
import androidx.compose.material.icons.filled.NightShelter
import androidx.compose.material.icons.filled.Nightlife
import androidx.compose.material.icons.filled.Nightlight
import androidx.compose.material.icons.filled.NightlightRound
import androidx.compose.material.icons.filled.NightsStay
import androidx.compose.material.icons.filled.NoAccounts
import androidx.compose.material.icons.filled.NoAdultContent
import androidx.compose.material.icons.filled.NoBackpack
import androidx.compose.material.icons.filled.NoCell
import androidx.compose.material.icons.filled.NoCrash
import androidx.compose.material.icons.filled.NoDrinks
import androidx.compose.material.icons.filled.NoEncryption
import androidx.compose.material.icons.filled.NoEncryptionGmailerrorred
import androidx.compose.material.icons.filled.NoFlash
import androidx.compose.material.icons.filled.NoFood
import androidx.compose.material.icons.filled.NoLuggage
import androidx.compose.material.icons.filled.NoMeals
import androidx.compose.material.icons.filled.NoMeetingRoom
import androidx.compose.material.icons.filled.NoPhotography
import androidx.compose.material.icons.filled.NoSim
import androidx.compose.material.icons.filled.NoStroller
import androidx.compose.material.icons.filled.NoTransfer
import androidx.compose.material.icons.filled.NoiseAware
import androidx.compose.material.icons.filled.NoiseControlOff
import androidx.compose.material.icons.filled.NordicWalking
import androidx.compose.material.icons.filled.North
import androidx.compose.material.icons.filled.NorthEast
import androidx.compose.material.icons.filled.NorthWest
import androidx.compose.material.icons.filled.NotAccessible
import androidx.compose.material.icons.filled.NotInterested
import androidx.compose.material.icons.filled.NotStarted
import androidx.compose.material.icons.filled.NoteAlt
import androidx.compose.material.icons.filled.NotificationAdd
import androidx.compose.material.icons.filled.NotificationImportant
import androidx.compose.material.icons.filled.NotificationsActive
import androidx.compose.material.icons.filled.NotificationsNone
import androidx.compose.material.icons.filled.NotificationsOff
import androidx.compose.material.icons.filled.NotificationsPaused
import androidx.compose.material.icons.filled.Numbers
import androidx.compose.material.icons.filled.OfflineBolt
import androidx.compose.material.icons.filled.OfflinePin
import androidx.compose.material.icons.filled.OilBarrel
import androidx.compose.material.icons.filled.OnDeviceTraining
import androidx.compose.material.icons.filled.OndemandVideo
import androidx.compose.material.icons.filled.OnlinePrediction
import androidx.compose.material.icons.filled.Opacity
import androidx.compose.material.icons.filled.OpenInBrowser
import androidx.compose.material.icons.filled.OpenInFull
import androidx.compose.material.icons.filled.OpenInNewOff
import androidx.compose.material.icons.filled.OpenWith
import androidx.compose.material.icons.filled.OtherHouses
import androidx.compose.material.icons.filled.Outbond
import androidx.compose.material.icons.filled.Outbox
import androidx.compose.material.icons.filled.OutdoorGrill
import androidx.compose.material.icons.filled.Outlet
import androidx.compose.material.icons.filled.OutlinedFlag
import androidx.compose.material.icons.filled.Output
import androidx.compose.material.icons.filled.Padding
import androidx.compose.material.icons.filled.Pages
import androidx.compose.material.icons.filled.Pageview
import androidx.compose.material.icons.filled.Paid
import androidx.compose.material.icons.filled.Palette
import androidx.compose.material.icons.filled.PanTool
import androidx.compose.material.icons.filled.PanToolAlt
import androidx.compose.material.icons.filled.Panorama
import androidx.compose.material.icons.filled.PanoramaFishEye
import androidx.compose.material.icons.filled.PanoramaHorizontal
import androidx.compose.material.icons.filled.PanoramaHorizontalSelect
import androidx.compose.material.icons.filled.PanoramaPhotosphere
import androidx.compose.material.icons.filled.PanoramaPhotosphereSelect
import androidx.compose.material.icons.filled.PanoramaVertical
import androidx.compose.material.icons.filled.PanoramaVerticalSelect
import androidx.compose.material.icons.filled.PanoramaWideAngle
import androidx.compose.material.icons.filled.PanoramaWideAngleSelect
import androidx.compose.material.icons.filled.Paragliding
import androidx.compose.material.icons.filled.Park
import androidx.compose.material.icons.filled.PartyMode
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.Pattern
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PauseCircle
import androidx.compose.material.icons.filled.PauseCircleFilled
import androidx.compose.material.icons.filled.PauseCircleOutline
import androidx.compose.material.icons.filled.PausePresentation
import androidx.compose.material.icons.filled.Payment
import androidx.compose.material.icons.filled.Payments
import androidx.compose.material.icons.filled.PedalBike
import androidx.compose.material.icons.filled.Pending
import androidx.compose.material.icons.filled.PendingActions
import androidx.compose.material.icons.filled.Pentagon
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.PeopleAlt
import androidx.compose.material.icons.filled.PeopleOutline
import androidx.compose.material.icons.filled.Percent
import androidx.compose.material.icons.filled.PermCameraMic
import androidx.compose.material.icons.filled.PermContactCalendar
import androidx.compose.material.icons.filled.PermDataSetting
import androidx.compose.material.icons.filled.PermDeviceInformation
import androidx.compose.material.icons.filled.PermIdentity
import androidx.compose.material.icons.filled.PermMedia
import androidx.compose.material.icons.filled.PermPhoneMsg
import androidx.compose.material.icons.filled.PermScanWifi
import androidx.compose.material.icons.filled.Person2
import androidx.compose.material.icons.filled.Person3
import androidx.compose.material.icons.filled.Person4
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.filled.PersonAddAlt
import androidx.compose.material.icons.filled.PersonAddAlt1
import androidx.compose.material.icons.filled.PersonAddDisabled
import androidx.compose.material.icons.filled.PersonOff
import androidx.compose.material.icons.filled.PersonOutline
import androidx.compose.material.icons.filled.PersonPin
import androidx.compose.material.icons.filled.PersonPinCircle
import androidx.compose.material.icons.filled.PersonRemove
import androidx.compose.material.icons.filled.PersonRemoveAlt1
import androidx.compose.material.icons.filled.PersonSearch
import androidx.compose.material.icons.filled.PersonalInjury
import androidx.compose.material.icons.filled.PersonalVideo
import androidx.compose.material.icons.filled.PestControl
import androidx.compose.material.icons.filled.PestControlRodent
import androidx.compose.material.icons.filled.Pets
import androidx.compose.material.icons.filled.Phishing
import androidx.compose.material.icons.filled.PhoneAndroid
import androidx.compose.material.icons.filled.PhoneBluetoothSpeaker
import androidx.compose.material.icons.filled.PhoneDisabled
import androidx.compose.material.icons.filled.PhoneEnabled
import androidx.compose.material.icons.filled.PhoneInTalk
import androidx.compose.material.icons.filled.PhoneIphone
import androidx.compose.material.icons.filled.PhoneLocked
import androidx.compose.material.icons.filled.PhonePaused
import androidx.compose.material.icons.filled.Phonelink
import androidx.compose.material.icons.filled.PhonelinkErase
import androidx.compose.material.icons.filled.PhonelinkLock
import androidx.compose.material.icons.filled.PhonelinkOff
import androidx.compose.material.icons.filled.PhonelinkRing
import androidx.compose.material.icons.filled.PhonelinkSetup
import androidx.compose.material.icons.filled.Photo
import androidx.compose.material.icons.filled.PhotoAlbum
import androidx.compose.material.icons.filled.PhotoCamera
import androidx.compose.material.icons.filled.PhotoCameraBack
import androidx.compose.material.icons.filled.PhotoCameraFront
import androidx.compose.material.icons.filled.PhotoFilter
import androidx.compose.material.icons.filled.PhotoLibrary
import androidx.compose.material.icons.filled.PhotoSizeSelectActual
import androidx.compose.material.icons.filled.PhotoSizeSelectLarge
import androidx.compose.material.icons.filled.PhotoSizeSelectSmall
import androidx.compose.material.icons.filled.Php
import androidx.compose.material.icons.filled.Piano
import androidx.compose.material.icons.filled.PianoOff
import androidx.compose.material.icons.filled.PictureAsPdf
import androidx.compose.material.icons.filled.PictureInPicture
import androidx.compose.material.icons.filled.PictureInPictureAlt
import androidx.compose.material.icons.filled.PieChart
import androidx.compose.material.icons.filled.PieChartOutline
import androidx.compose.material.icons.filled.Pin
import androidx.compose.material.icons.filled.PinDrop
import androidx.compose.material.icons.filled.PinEnd
import androidx.compose.material.icons.filled.PinInvoke
import androidx.compose.material.icons.filled.Pinch
import androidx.compose.material.icons.filled.PivotTableChart
import androidx.compose.material.icons.filled.Pix
import androidx.compose.material.icons.filled.Plagiarism
import androidx.compose.material.icons.filled.PlayCircle
import androidx.compose.material.icons.filled.PlayCircleFilled
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.material.icons.filled.PlayDisabled
import androidx.compose.material.icons.filled.PlayForWork
import androidx.compose.material.icons.filled.PlayLesson
import androidx.compose.material.icons.filled.PlaylistAddCheckCircle
import androidx.compose.material.icons.filled.PlaylistAddCircle
import androidx.compose.material.icons.filled.PlaylistRemove
import androidx.compose.material.icons.filled.Plumbing
import androidx.compose.material.icons.filled.PlusOne
import androidx.compose.material.icons.filled.Podcasts
import androidx.compose.material.icons.filled.PointOfSale
import androidx.compose.material.icons.filled.Policy
import androidx.compose.material.icons.filled.Poll
import androidx.compose.material.icons.filled.Polyline
import androidx.compose.material.icons.filled.Polymer
import androidx.compose.material.icons.filled.Pool
import androidx.compose.material.icons.filled.PortableWifiOff
import androidx.compose.material.icons.filled.Portrait
import androidx.compose.material.icons.filled.PostAdd
import androidx.compose.material.icons.filled.Power
import androidx.compose.material.icons.filled.PowerInput
import androidx.compose.material.icons.filled.PowerOff
import androidx.compose.material.icons.filled.PowerSettingsNew
import androidx.compose.material.icons.filled.PrecisionManufacturing
import androidx.compose.material.icons.filled.PregnantWoman
import androidx.compose.material.icons.filled.PresentToAll
import androidx.compose.material.icons.filled.Preview
import androidx.compose.material.icons.filled.PriceChange
import androidx.compose.material.icons.filled.PriceCheck
import androidx.compose.material.icons.filled.Print
import androidx.compose.material.icons.filled.PrintDisabled
import androidx.compose.material.icons.filled.PriorityHigh
import androidx.compose.material.icons.filled.PrivacyTip
import androidx.compose.material.icons.filled.PrivateConnectivity
import androidx.compose.material.icons.filled.ProductionQuantityLimits
import androidx.compose.material.icons.filled.Propane
import androidx.compose.material.icons.filled.PropaneTank
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.PsychologyAlt
import androidx.compose.material.icons.filled.Public
import androidx.compose.material.icons.filled.PublicOff
import androidx.compose.material.icons.filled.Publish
import androidx.compose.material.icons.filled.PublishedWithChanges
import androidx.compose.material.icons.filled.PunchClock
import androidx.compose.material.icons.filled.PushPin
import androidx.compose.material.icons.filled.QrCode
import androidx.compose.material.icons.filled.QrCode2
import androidx.compose.material.icons.filled.QrCodeScanner
import androidx.compose.material.icons.filled.QueryBuilder
import androidx.compose.material.icons.filled.QueryStats
import androidx.compose.material.icons.filled.QuestionAnswer
import androidx.compose.material.icons.filled.QuestionMark
import androidx.compose.material.icons.filled.Queue
import androidx.compose.material.icons.filled.QueuePlayNext
import androidx.compose.material.icons.filled.Quickreply
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.RMobiledata
import androidx.compose.material.icons.filled.Radar
import androidx.compose.material.icons.filled.Radio
import androidx.compose.material.icons.filled.RadioButtonChecked
import androidx.compose.material.icons.filled.RadioButtonUnchecked
import androidx.compose.material.icons.filled.RailwayAlert
import androidx.compose.material.icons.filled.RamenDining
import androidx.compose.material.icons.filled.RampLeft
import androidx.compose.material.icons.filled.RampRight
import androidx.compose.material.icons.filled.RateReview
import androidx.compose.material.icons.filled.RawOff
import androidx.compose.material.icons.filled.RawOn
import androidx.compose.material.icons.filled.RealEstateAgent
import androidx.compose.material.icons.filled.Receipt
import androidx.compose.material.icons.filled.RecentActors
import androidx.compose.material.icons.filled.Recommend
import androidx.compose.material.icons.filled.RecordVoiceOver
import androidx.compose.material.icons.filled.Rectangle
import androidx.compose.material.icons.filled.Recycling
import androidx.compose.material.icons.filled.Redeem
import androidx.compose.material.icons.filled.ReduceCapacity
import androidx.compose.material.icons.filled.RememberMe
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material.icons.filled.RemoveCircle
import androidx.compose.material.icons.filled.RemoveCircleOutline
import androidx.compose.material.icons.filled.RemoveDone
import androidx.compose.material.icons.filled.RemoveFromQueue
import androidx.compose.material.icons.filled.RemoveModerator
import androidx.compose.material.icons.filled.RemoveRedEye
import androidx.compose.material.icons.filled.RemoveRoad
import androidx.compose.material.icons.filled.RemoveShoppingCart
import androidx.compose.material.icons.filled.Reorder
import androidx.compose.material.icons.filled.Repartition
import androidx.compose.material.icons.filled.Repeat
import androidx.compose.material.icons.filled.RepeatOn
import androidx.compose.material.icons.filled.RepeatOne
import androidx.compose.material.icons.filled.RepeatOneOn
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material.icons.filled.Replay10
import androidx.compose.material.icons.filled.Replay30
import androidx.compose.material.icons.filled.Replay5
import androidx.compose.material.icons.filled.ReplayCircleFilled
import androidx.compose.material.icons.filled.Report
import androidx.compose.material.icons.filled.ReportGmailerrorred
import androidx.compose.material.icons.filled.ReportOff
import androidx.compose.material.icons.filled.ReportProblem
import androidx.compose.material.icons.filled.RequestPage
import androidx.compose.material.icons.filled.RequestQuote
import androidx.compose.material.icons.filled.ResetTv
import androidx.compose.material.icons.filled.RestartAlt
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.RestaurantMenu
import androidx.compose.material.icons.filled.Restore
import androidx.compose.material.icons.filled.RestoreFromTrash
import androidx.compose.material.icons.filled.RestorePage
import androidx.compose.material.icons.filled.Reviews
import androidx.compose.material.icons.filled.RiceBowl
import androidx.compose.material.icons.filled.RingVolume
import androidx.compose.material.icons.filled.Rocket
import androidx.compose.material.icons.filled.RocketLaunch
import androidx.compose.material.icons.filled.RollerShades
import androidx.compose.material.icons.filled.RollerShadesClosed
import androidx.compose.material.icons.filled.RollerSkating
import androidx.compose.material.icons.filled.Roofing
import androidx.compose.material.icons.filled.Room
import androidx.compose.material.icons.filled.RoomPreferences
import androidx.compose.material.icons.filled.RoomService
import androidx.compose.material.icons.filled.Rotate90DegreesCcw
import androidx.compose.material.icons.filled.Rotate90DegreesCw
import androidx.compose.material.icons.filled.RoundaboutLeft
import androidx.compose.material.icons.filled.RoundaboutRight
import androidx.compose.material.icons.filled.RoundedCorner
import androidx.compose.material.icons.filled.Route
import androidx.compose.material.icons.filled.Router
import androidx.compose.material.icons.filled.Rowing
import androidx.compose.material.icons.filled.RssFeed
import androidx.compose.material.icons.filled.Rsvp
import androidx.compose.material.icons.filled.RuleFolder
import androidx.compose.material.icons.filled.RunCircle
import androidx.compose.material.icons.filled.RunningWithErrors
import androidx.compose.material.icons.filled.RvHookup
import androidx.compose.material.icons.filled.SafetyCheck
import androidx.compose.material.icons.filled.SafetyDivider
import androidx.compose.material.icons.filled.Sailing
import androidx.compose.material.icons.filled.Sanitizer
import androidx.compose.material.icons.filled.Satellite
import androidx.compose.material.icons.filled.SatelliteAlt
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.SaveAlt
import androidx.compose.material.icons.filled.SaveAs
import androidx.compose.material.icons.filled.SavedSearch
import androidx.compose.material.icons.filled.Savings
import androidx.compose.material.icons.filled.Scale
import androidx.compose.material.icons.filled.Scanner
import androidx.compose.material.icons.filled.ScatterPlot
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.Schema
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Science
import androidx.compose.material.icons.filled.Score
import androidx.compose.material.icons.filled.Scoreboard
import androidx.compose.material.icons.filled.ScreenLockLandscape
import androidx.compose.material.icons.filled.ScreenLockPortrait
import androidx.compose.material.icons.filled.ScreenLockRotation
import androidx.compose.material.icons.filled.ScreenRotation
import androidx.compose.material.icons.filled.ScreenRotationAlt
import androidx.compose.material.icons.filled.ScreenSearchDesktop
import androidx.compose.material.icons.filled.Screenshot
import androidx.compose.material.icons.filled.ScreenshotMonitor
import androidx.compose.material.icons.filled.ScubaDiving
import androidx.compose.material.icons.filled.Sd
import androidx.compose.material.icons.filled.SdCard
import androidx.compose.material.icons.filled.SdCardAlert
import androidx.compose.material.icons.filled.SdStorage
import androidx.compose.material.icons.filled.SearchOff
import androidx.compose.material.icons.filled.Security
import androidx.compose.material.icons.filled.SecurityUpdate
import androidx.compose.material.icons.filled.SecurityUpdateGood
import androidx.compose.material.icons.filled.SecurityUpdateWarning
import androidx.compose.material.icons.filled.SelectAll
import androidx.compose.material.icons.filled.SelfImprovement
import androidx.compose.material.icons.filled.Sell
import androidx.compose.material.icons.filled.SendTimeExtension
import androidx.compose.material.icons.filled.SensorDoor
import androidx.compose.material.icons.filled.SensorOccupied
import androidx.compose.material.icons.filled.SensorWindow
import androidx.compose.material.icons.filled.Sensors
import androidx.compose.material.icons.filled.SensorsOff
import androidx.compose.material.icons.filled.SentimentDissatisfied
import androidx.compose.material.icons.filled.SentimentNeutral
import androidx.compose.material.icons.filled.SentimentSatisfied
import androidx.compose.material.icons.filled.SentimentSatisfiedAlt
import androidx.compose.material.icons.filled.SentimentVeryDissatisfied
import androidx.compose.material.icons.filled.SentimentVerySatisfied
import androidx.compose.material.icons.filled.SetMeal
import androidx.compose.material.icons.filled.SettingsAccessibility
import androidx.compose.material.icons.filled.SettingsApplications
import androidx.compose.material.icons.filled.SettingsBackupRestore
import androidx.compose.material.icons.filled.SettingsBluetooth
import androidx.compose.material.icons.filled.SettingsBrightness
import androidx.compose.material.icons.filled.SettingsCell
import androidx.compose.material.icons.filled.SettingsEthernet
import androidx.compose.material.icons.filled.SettingsInputAntenna
import androidx.compose.material.icons.filled.SettingsInputComponent
import androidx.compose.material.icons.filled.SettingsInputComposite
import androidx.compose.material.icons.filled.SettingsInputHdmi
import androidx.compose.material.icons.filled.SettingsInputSvideo
import androidx.compose.material.icons.filled.SettingsOverscan
import androidx.compose.material.icons.filled.SettingsPhone
import androidx.compose.material.icons.filled.SettingsPower
import androidx.compose.material.icons.filled.SettingsRemote
import androidx.compose.material.icons.filled.SettingsSuggest
import androidx.compose.material.icons.filled.SettingsSystemDaydream
import androidx.compose.material.icons.filled.SettingsVoice
import androidx.compose.material.icons.filled.SevereCold
import androidx.compose.material.icons.filled.ShapeLine
import androidx.compose.material.icons.filled.ShareLocation
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material.icons.filled.ShieldMoon
import androidx.compose.material.icons.filled.Shop
import androidx.compose.material.icons.filled.Shop2
import androidx.compose.material.icons.filled.ShopTwo
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material.icons.filled.ShoppingBasket
import androidx.compose.material.icons.filled.ShoppingCartCheckout
import androidx.compose.material.icons.filled.Shower
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.material.icons.filled.ShuffleOn
import androidx.compose.material.icons.filled.ShutterSpeed
import androidx.compose.material.icons.filled.Sick
import androidx.compose.material.icons.filled.SignLanguage
import androidx.compose.material.icons.filled.SignalCellular0Bar
import androidx.compose.material.icons.filled.SignalCellular4Bar
import androidx.compose.material.icons.filled.SignalCellularAlt
import androidx.compose.material.icons.filled.SignalCellularAlt1Bar
import androidx.compose.material.icons.filled.SignalCellularAlt2Bar
import androidx.compose.material.icons.filled.SignalCellularConnectedNoInternet0Bar
import androidx.compose.material.icons.filled.SignalCellularConnectedNoInternet4Bar
import androidx.compose.material.icons.filled.SignalCellularNoSim
import androidx.compose.material.icons.filled.SignalCellularNodata
import androidx.compose.material.icons.filled.SignalCellularNull
import androidx.compose.material.icons.filled.SignalCellularOff
import androidx.compose.material.icons.filled.SignalWifi0Bar
import androidx.compose.material.icons.filled.SignalWifi4Bar
import androidx.compose.material.icons.filled.SignalWifi4BarLock
import androidx.compose.material.icons.filled.SignalWifiBad
import androidx.compose.material.icons.filled.SignalWifiConnectedNoInternet4
import androidx.compose.material.icons.filled.SignalWifiOff
import androidx.compose.material.icons.filled.SignalWifiStatusbar4Bar
import androidx.compose.material.icons.filled.SignalWifiStatusbarConnectedNoInternet4
import androidx.compose.material.icons.filled.SignalWifiStatusbarNull
import androidx.compose.material.icons.filled.Signpost
import androidx.compose.material.icons.filled.SimCard
import androidx.compose.material.icons.filled.SimCardAlert
import androidx.compose.material.icons.filled.SimCardDownload
import androidx.compose.material.icons.filled.SingleBed
import androidx.compose.material.icons.filled.Sip
import androidx.compose.material.icons.filled.Skateboarding
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.SkipPrevious
import androidx.compose.material.icons.filled.Sledding
import androidx.compose.material.icons.filled.Slideshow
import androidx.compose.material.icons.filled.SlowMotionVideo
import androidx.compose.material.icons.filled.SmartButton
import androidx.compose.material.icons.filled.SmartDisplay
import androidx.compose.material.icons.filled.SmartScreen
import androidx.compose.material.icons.filled.SmartToy
import androidx.compose.material.icons.filled.Smartphone
import androidx.compose.material.icons.filled.SmokeFree
import androidx.compose.material.icons.filled.SmokingRooms
import androidx.compose.material.icons.filled.Sms
import androidx.compose.material.icons.filled.SmsFailed
import androidx.compose.material.icons.filled.SnippetFolder
import androidx.compose.material.icons.filled.Snooze
import androidx.compose.material.icons.filled.Snowboarding
import androidx.compose.material.icons.filled.Snowmobile
import androidx.compose.material.icons.filled.Snowshoeing
import androidx.compose.material.icons.filled.Soap
import androidx.compose.material.icons.filled.SocialDistance
import androidx.compose.material.icons.filled.SolarPower
import androidx.compose.material.icons.filled.SortByAlpha
import androidx.compose.material.icons.filled.Sos
import androidx.compose.material.icons.filled.SoupKitchen
import androidx.compose.material.icons.filled.Source
import androidx.compose.material.icons.filled.South
import androidx.compose.material.icons.filled.SouthAmerica
import androidx.compose.material.icons.filled.SouthEast
import androidx.compose.material.icons.filled.SouthWest
import androidx.compose.material.icons.filled.Spa
import androidx.compose.material.icons.filled.SpaceBar
import androidx.compose.material.icons.filled.SpaceDashboard
import androidx.compose.material.icons.filled.SpatialAudio
import androidx.compose.material.icons.filled.SpatialAudioOff
import androidx.compose.material.icons.filled.SpatialTracking
import androidx.compose.material.icons.filled.Speaker
import androidx.compose.material.icons.filled.SpeakerGroup
import androidx.compose.material.icons.filled.SpeakerNotesOff
import androidx.compose.material.icons.filled.SpeakerPhone
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material.icons.filled.Spellcheck
import androidx.compose.material.icons.filled.Splitscreen
import androidx.compose.material.icons.filled.Spoke
import androidx.compose.material.icons.filled.Sports
import androidx.compose.material.icons.filled.SportsBar
import androidx.compose.material.icons.filled.SportsBaseball
import androidx.compose.material.icons.filled.SportsBasketball
import androidx.compose.material.icons.filled.SportsCricket
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.material.icons.filled.SportsFootball
import androidx.compose.material.icons.filled.SportsGolf
import androidx.compose.material.icons.filled.SportsGymnastics
import androidx.compose.material.icons.filled.SportsHandball
import androidx.compose.material.icons.filled.SportsHockey
import androidx.compose.material.icons.filled.SportsKabaddi
import androidx.compose.material.icons.filled.SportsMartialArts
import androidx.compose.material.icons.filled.SportsMma
import androidx.compose.material.icons.filled.SportsMotorsports
import androidx.compose.material.icons.filled.SportsRugby
import androidx.compose.material.icons.filled.SportsScore
import androidx.compose.material.icons.filled.SportsSoccer
import androidx.compose.material.icons.filled.SportsTennis
import androidx.compose.material.icons.filled.SportsVolleyball
import androidx.compose.material.icons.filled.Square
import androidx.compose.material.icons.filled.SquareFoot
import androidx.compose.material.icons.filled.SsidChart
import androidx.compose.material.icons.filled.StackedBarChart
import androidx.compose.material.icons.filled.StackedLineChart
import androidx.compose.material.icons.filled.Stadium
import androidx.compose.material.icons.filled.Stairs
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material.icons.filled.StarBorderPurple500
import androidx.compose.material.icons.filled.StarOutline
import androidx.compose.material.icons.filled.StarPurple500
import androidx.compose.material.icons.filled.StarRate
import androidx.compose.material.icons.filled.Stars
import androidx.compose.material.icons.filled.Start
import androidx.compose.material.icons.filled.StayCurrentLandscape
import androidx.compose.material.icons.filled.StayCurrentPortrait
import androidx.compose.material.icons.filled.StayPrimaryLandscape
import androidx.compose.material.icons.filled.StayPrimaryPortrait
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material.icons.filled.StopCircle
import androidx.compose.material.icons.filled.Storage
import androidx.compose.material.icons.filled.Store
import androidx.compose.material.icons.filled.StoreMallDirectory
import androidx.compose.material.icons.filled.Storefront
import androidx.compose.material.icons.filled.Storm
import androidx.compose.material.icons.filled.Straight
import androidx.compose.material.icons.filled.Straighten
import androidx.compose.material.icons.filled.Stream
import androidx.compose.material.icons.filled.Streetview
import androidx.compose.material.icons.filled.StrikethroughS
import androidx.compose.material.icons.filled.Stroller
import androidx.compose.material.icons.filled.Style
import androidx.compose.material.icons.filled.SubdirectoryArrowLeft
import androidx.compose.material.icons.filled.SubdirectoryArrowRight
import androidx.compose.material.icons.filled.Subscript
import androidx.compose.material.icons.filled.Subscriptions
import androidx.compose.material.icons.filled.Subtitles
import androidx.compose.material.icons.filled.SubtitlesOff
import androidx.compose.material.icons.filled.Subway
import androidx.compose.material.icons.filled.Summarize
import androidx.compose.material.icons.filled.Superscript
import androidx.compose.material.icons.filled.SupervisedUserCircle
import androidx.compose.material.icons.filled.SupervisorAccount
import androidx.compose.material.icons.filled.Support
import androidx.compose.material.icons.filled.SupportAgent
import androidx.compose.material.icons.filled.Surfing
import androidx.compose.material.icons.filled.SurroundSound
import androidx.compose.material.icons.filled.SwapCalls
import androidx.compose.material.icons.filled.SwapHoriz
import androidx.compose.material.icons.filled.SwapHorizontalCircle
import androidx.compose.material.icons.filled.SwapVert
import androidx.compose.material.icons.filled.SwapVerticalCircle
import androidx.compose.material.icons.filled.Swipe
import androidx.compose.material.icons.filled.SwipeDown
import androidx.compose.material.icons.filled.SwipeDownAlt
import androidx.compose.material.icons.filled.SwipeLeft
import androidx.compose.material.icons.filled.SwipeLeftAlt
import androidx.compose.material.icons.filled.SwipeRight
import androidx.compose.material.icons.filled.SwipeRightAlt
import androidx.compose.material.icons.filled.SwipeUp
import androidx.compose.material.icons.filled.SwipeUpAlt
import androidx.compose.material.icons.filled.SwipeVertical
import androidx.compose.material.icons.filled.SwitchAccessShortcut
import androidx.compose.material.icons.filled.SwitchAccessShortcutAdd
import androidx.compose.material.icons.filled.SwitchAccount
import androidx.compose.material.icons.filled.SwitchCamera
import androidx.compose.material.icons.filled.SwitchLeft
import androidx.compose.material.icons.filled.SwitchRight
import androidx.compose.material.icons.filled.SwitchVideo
import androidx.compose.material.icons.filled.Synagogue
import androidx.compose.material.icons.filled.Sync
import androidx.compose.material.icons.filled.SyncAlt
import androidx.compose.material.icons.filled.SyncDisabled
import androidx.compose.material.icons.filled.SyncLock
import androidx.compose.material.icons.filled.SyncProblem
import androidx.compose.material.icons.filled.SystemSecurityUpdate
import androidx.compose.material.icons.filled.SystemSecurityUpdateGood
import androidx.compose.material.icons.filled.SystemSecurityUpdateWarning
import androidx.compose.material.icons.filled.SystemUpdate
import androidx.compose.material.icons.filled.SystemUpdateAlt
import androidx.compose.material.icons.filled.Tab
import androidx.compose.material.icons.filled.TabUnselected
import androidx.compose.material.icons.filled.TableBar
import androidx.compose.material.icons.filled.TableChart
import androidx.compose.material.icons.filled.TableRestaurant
import androidx.compose.material.icons.filled.TableRows
import androidx.compose.material.icons.filled.TableView
import androidx.compose.material.icons.filled.Tablet
import androidx.compose.material.icons.filled.TabletAndroid
import androidx.compose.material.icons.filled.TabletMac
import androidx.compose.material.icons.filled.Tag
import androidx.compose.material.icons.filled.TagFaces
import androidx.compose.material.icons.filled.TakeoutDining
import androidx.compose.material.icons.filled.TapAndPlay
import androidx.compose.material.icons.filled.Tapas
import androidx.compose.material.icons.filled.Task
import androidx.compose.material.icons.filled.TaskAlt
import androidx.compose.material.icons.filled.TaxiAlert
import androidx.compose.material.icons.filled.TempleBuddhist
import androidx.compose.material.icons.filled.TempleHindu
import androidx.compose.material.icons.filled.Terminal
import androidx.compose.material.icons.filled.Terrain
import androidx.compose.material.icons.filled.TextDecrease
import androidx.compose.material.icons.filled.TextFields
import androidx.compose.material.icons.filled.TextFormat
import androidx.compose.material.icons.filled.TextIncrease
import androidx.compose.material.icons.filled.TextRotateUp
import androidx.compose.material.icons.filled.TextRotateVertical
import androidx.compose.material.icons.filled.TextRotationAngledown
import androidx.compose.material.icons.filled.TextRotationAngleup
import androidx.compose.material.icons.filled.TextRotationDown
import androidx.compose.material.icons.filled.TextRotationNone
import androidx.compose.material.icons.filled.Textsms
import androidx.compose.material.icons.filled.Texture
import androidx.compose.material.icons.filled.TheaterComedy
import androidx.compose.material.icons.filled.Theaters
import androidx.compose.material.icons.filled.Thermostat
import androidx.compose.material.icons.filled.ThermostatAuto
import androidx.compose.material.icons.filled.ThumbDown
import androidx.compose.material.icons.filled.ThumbDownAlt
import androidx.compose.material.icons.filled.ThumbDownOffAlt
import androidx.compose.material.icons.filled.ThumbUpAlt
import androidx.compose.material.icons.filled.ThumbUpOffAlt
import androidx.compose.material.icons.filled.ThumbsUpDown
import androidx.compose.material.icons.filled.Thunderstorm
import androidx.compose.material.icons.filled.TimeToLeave
import androidx.compose.material.icons.filled.Timelapse
import androidx.compose.material.icons.filled.Timeline
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.Timer10
import androidx.compose.material.icons.filled.Timer10Select
import androidx.compose.material.icons.filled.Timer3
import androidx.compose.material.icons.filled.Timer3Select
import androidx.compose.material.icons.filled.TimerOff
import androidx.compose.material.icons.filled.TipsAndUpdates
import androidx.compose.material.icons.filled.TireRepair
import androidx.compose.material.icons.filled.Title
import androidx.compose.material.icons.filled.Today
import androidx.compose.material.icons.filled.ToggleOff
import androidx.compose.material.icons.filled.ToggleOn
import androidx.compose.material.icons.filled.Token
import androidx.compose.material.icons.filled.Toll
import androidx.compose.material.icons.filled.Tonality
import androidx.compose.material.icons.filled.Topic
import androidx.compose.material.icons.filled.Tornado
import androidx.compose.material.icons.filled.TouchApp
import androidx.compose.material.icons.filled.Tour
import androidx.compose.material.icons.filled.Toys
import androidx.compose.material.icons.filled.TrackChanges
import androidx.compose.material.icons.filled.Traffic
import androidx.compose.material.icons.filled.Train
import androidx.compose.material.icons.filled.Tram
import androidx.compose.material.icons.filled.Transcribe
import androidx.compose.material.icons.filled.TransferWithinAStation
import androidx.compose.material.icons.filled.Transform
import androidx.compose.material.icons.filled.Transgender
import androidx.compose.material.icons.filled.TransitEnterexit
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material.icons.filled.TravelExplore
import androidx.compose.material.icons.filled.TripOrigin
import androidx.compose.material.icons.filled.Troubleshoot
import androidx.compose.material.icons.filled.Try
import androidx.compose.material.icons.filled.Tsunami
import androidx.compose.material.icons.filled.Tty
import androidx.compose.material.icons.filled.Tune
import androidx.compose.material.icons.filled.Tungsten
import androidx.compose.material.icons.filled.TurnLeft
import androidx.compose.material.icons.filled.TurnRight
import androidx.compose.material.icons.filled.TurnSharpLeft
import androidx.compose.material.icons.filled.TurnSharpRight
import androidx.compose.material.icons.filled.TurnSlightLeft
import androidx.compose.material.icons.filled.TurnSlightRight
import androidx.compose.material.icons.filled.TurnedIn
import androidx.compose.material.icons.filled.TurnedInNot
import androidx.compose.material.icons.filled.Tv
import androidx.compose.material.icons.filled.TvOff
import androidx.compose.material.icons.filled.TwoWheeler
import androidx.compose.material.icons.filled.TypeSpecimen
import androidx.compose.material.icons.filled.UTurnLeft
import androidx.compose.material.icons.filled.UTurnRight
import androidx.compose.material.icons.filled.Umbrella
import androidx.compose.material.icons.filled.Unarchive
import androidx.compose.material.icons.filled.UnfoldLess
import androidx.compose.material.icons.filled.UnfoldLessDouble
import androidx.compose.material.icons.filled.UnfoldMore
import androidx.compose.material.icons.filled.UnfoldMoreDouble
import androidx.compose.material.icons.filled.Unpublished
import androidx.compose.material.icons.filled.Unsubscribe
import androidx.compose.material.icons.filled.Upcoming
import androidx.compose.material.icons.filled.Update
import androidx.compose.material.icons.filled.UpdateDisabled
import androidx.compose.material.icons.filled.Upgrade
import androidx.compose.material.icons.filled.Upload
import androidx.compose.material.icons.filled.UploadFile
import androidx.compose.material.icons.filled.Usb
import androidx.compose.material.icons.filled.UsbOff
import androidx.compose.material.icons.filled.Vaccines
import androidx.compose.material.icons.filled.VapeFree
import androidx.compose.material.icons.filled.VapingRooms
import androidx.compose.material.icons.filled.Verified
import androidx.compose.material.icons.filled.VerifiedUser
import androidx.compose.material.icons.filled.VerticalAlignBottom
import androidx.compose.material.icons.filled.VerticalAlignCenter
import androidx.compose.material.icons.filled.VerticalAlignTop
import androidx.compose.material.icons.filled.VerticalDistribute
import androidx.compose.material.icons.filled.VerticalShades
import androidx.compose.material.icons.filled.VerticalShadesClosed
import androidx.compose.material.icons.filled.VerticalSplit
import androidx.compose.material.icons.filled.Vibration
import androidx.compose.material.icons.filled.VideoCall
import androidx.compose.material.icons.filled.VideoCameraBack
import androidx.compose.material.icons.filled.VideoCameraFront
import androidx.compose.material.icons.filled.VideoChat
import androidx.compose.material.icons.filled.VideoFile
import androidx.compose.material.icons.filled.VideoLabel
import androidx.compose.material.icons.filled.VideoLibrary
import androidx.compose.material.icons.filled.VideoSettings
import androidx.compose.material.icons.filled.VideoStable
import androidx.compose.material.icons.filled.Videocam
import androidx.compose.material.icons.filled.VideocamOff
import androidx.compose.material.icons.filled.VideogameAsset
import androidx.compose.material.icons.filled.VideogameAssetOff
import androidx.compose.material.icons.filled.ViewAgenda
import androidx.compose.material.icons.filled.ViewArray
import androidx.compose.material.icons.filled.ViewCarousel
import androidx.compose.material.icons.filled.ViewColumn
import androidx.compose.material.icons.filled.ViewComfy
import androidx.compose.material.icons.filled.ViewComfyAlt
import androidx.compose.material.icons.filled.ViewCompact
import androidx.compose.material.icons.filled.ViewCompactAlt
import androidx.compose.material.icons.filled.ViewCozy
import androidx.compose.material.icons.filled.ViewDay
import androidx.compose.material.icons.filled.ViewHeadline
import androidx.compose.material.icons.filled.ViewInAr
import androidx.compose.material.icons.filled.ViewKanban
import androidx.compose.material.icons.filled.ViewModule
import androidx.compose.material.icons.filled.ViewStream
import androidx.compose.material.icons.filled.ViewTimeline
import androidx.compose.material.icons.filled.ViewWeek
import androidx.compose.material.icons.filled.Vignette
import androidx.compose.material.icons.filled.Villa
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.filled.VoiceChat
import androidx.compose.material.icons.filled.VoiceOverOff
import androidx.compose.material.icons.filled.Voicemail
import androidx.compose.material.icons.filled.Volcano
import androidx.compose.material.icons.filled.VolunteerActivism
import androidx.compose.material.icons.filled.VpnKey
import androidx.compose.material.icons.filled.VpnKeyOff
import androidx.compose.material.icons.filled.VpnLock
import androidx.compose.material.icons.filled.Vrpano
import androidx.compose.material.icons.filled.Wallet
import androidx.compose.material.icons.filled.Wallpaper
import androidx.compose.material.icons.filled.Warehouse
import androidx.compose.material.icons.filled.WarningAmber
import androidx.compose.material.icons.filled.Wash
import androidx.compose.material.icons.filled.Watch
import androidx.compose.material.icons.filled.WatchLater
import androidx.compose.material.icons.filled.WatchOff
import androidx.compose.material.icons.filled.Water
import androidx.compose.material.icons.filled.WaterDamage
import androidx.compose.material.icons.filled.WaterDrop
import androidx.compose.material.icons.filled.WaterfallChart
import androidx.compose.material.icons.filled.Waves
import androidx.compose.material.icons.filled.WavingHand
import androidx.compose.material.icons.filled.WbAuto
import androidx.compose.material.icons.filled.WbCloudy
import androidx.compose.material.icons.filled.WbIncandescent
import androidx.compose.material.icons.filled.WbIridescent
import androidx.compose.material.icons.filled.WbShade
import androidx.compose.material.icons.filled.WbSunny
import androidx.compose.material.icons.filled.WbTwilight
import androidx.compose.material.icons.filled.Wc
import androidx.compose.material.icons.filled.Web
import androidx.compose.material.icons.filled.WebAsset
import androidx.compose.material.icons.filled.WebAssetOff
import androidx.compose.material.icons.filled.WebStories
import androidx.compose.material.icons.filled.Webhook
import androidx.compose.material.icons.filled.Weekend
import androidx.compose.material.icons.filled.West
import androidx.compose.material.icons.filled.Whatsapp
import androidx.compose.material.icons.filled.Whatshot
import androidx.compose.material.icons.filled.WheelchairPickup
import androidx.compose.material.icons.filled.WhereToVote
import androidx.compose.material.icons.filled.Widgets
import androidx.compose.material.icons.filled.WidthFull
import androidx.compose.material.icons.filled.WidthNormal
import androidx.compose.material.icons.filled.WidthWide
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.material.icons.filled.Wifi1Bar
import androidx.compose.material.icons.filled.Wifi2Bar
import androidx.compose.material.icons.filled.WifiCalling
import androidx.compose.material.icons.filled.WifiCalling3
import androidx.compose.material.icons.filled.WifiChannel
import androidx.compose.material.icons.filled.WifiFind
import androidx.compose.material.icons.filled.WifiLock
import androidx.compose.material.icons.filled.WifiOff
import androidx.compose.material.icons.filled.WifiPassword
import androidx.compose.material.icons.filled.WifiProtectedSetup
import androidx.compose.material.icons.filled.WifiTethering
import androidx.compose.material.icons.filled.WifiTetheringError
import androidx.compose.material.icons.filled.WifiTetheringErrorRounded
import androidx.compose.material.icons.filled.WifiTetheringOff
import androidx.compose.material.icons.filled.WindPower
import androidx.compose.material.icons.filled.Window
import androidx.compose.material.icons.filled.WineBar
import androidx.compose.material.icons.filled.Woman
import androidx.compose.material.icons.filled.Woman2
import androidx.compose.material.icons.filled.Work
import androidx.compose.material.icons.filled.WorkHistory
import androidx.compose.material.icons.filled.WorkOff
import androidx.compose.material.icons.filled.WorkOutline
import androidx.compose.material.icons.filled.WorkspacePremium
import androidx.compose.material.icons.filled.Workspaces
import androidx.compose.material.icons.filled.WrongLocation
import androidx.compose.material.icons.filled.Yard
import androidx.compose.material.icons.filled.YoutubeSearchedFor
import androidx.compose.material.icons.filled.ZoomIn
import androidx.compose.material.icons.filled.ZoomInMap
import androidx.compose.material.icons.filled.ZoomOut
import androidx.compose.material.icons.filled.ZoomOutMap
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

val iconByName = mapOf(
    "Abc" to Icons.Filled.Abc,
    "AccessAlarm" to Icons.Filled.AccessAlarm,
    "AccessAlarms" to Icons.Filled.AccessAlarms,
    "Accessibility" to Icons.Filled.Accessibility,
    "AccessibilityNew" to Icons.Filled.AccessibilityNew,
    "AccessibleForward" to Icons.AutoMirrored.Filled.AccessibleForward,
    "Accessible" to Icons.AutoMirrored.Filled.Accessible,
    "AccessTimeFilled" to Icons.Filled.AccessTimeFilled,
    "AccessTime" to Icons.Filled.AccessTime,
    "AccountBalance" to Icons.Filled.AccountBalance,
    "AccountBalanceWallet" to Icons.Filled.AccountBalanceWallet,
    "AccountTree" to Icons.Filled.AccountTree,
    "AcUnit" to Icons.Filled.AcUnit,
    "Adb" to Icons.Filled.Adb,
    "AddAlarm" to Icons.Filled.AddAlarm,
    "AddAlert" to Icons.Filled.AddAlert,
    "AddAPhoto" to Icons.Filled.AddAPhoto,
    "AddBox" to Icons.Filled.AddBox,
    "AddBusiness" to Icons.Filled.AddBusiness,
    "AddCard" to Icons.Filled.AddCard,
    "AddChart" to Icons.Filled.AddChart,
    "AddCircleOutline" to Icons.Filled.AddCircleOutline,
    "AddComment" to Icons.Filled.AddComment,
    "AddHome" to Icons.Filled.AddHome,
    "AddHomeWork" to Icons.Filled.AddHomeWork,
    "AddIcCall" to Icons.Filled.AddIcCall,
    "AddLink" to Icons.Filled.AddLink,
    "AddLocationAlt" to Icons.Filled.AddLocationAlt,
    "AddLocation" to Icons.Filled.AddLocation,
    "AddModerator" to Icons.Filled.AddModerator,
    "AddPhotoAlternate" to Icons.Filled.AddPhotoAlternate,
    "AddReaction" to Icons.Filled.AddReaction,
    "AddRoad" to Icons.Filled.AddRoad,
    "AddShoppingCart" to Icons.Filled.AddShoppingCart,
    "AddTask" to Icons.Filled.AddTask,
    "AddToDrive" to Icons.Filled.AddToDrive,
    "AddToHomeScreen" to Icons.AutoMirrored.Filled.AddToHomeScreen,
    "AddToPhotos" to Icons.Filled.AddToPhotos,
    "AddToQueue" to Icons.Filled.AddToQueue,
    "AdfScanner" to Icons.Filled.AdfScanner,
    "Adjust" to Icons.Filled.Adjust,
    "AdminPanelSettings" to Icons.Filled.AdminPanelSettings,
    "AdsClick" to Icons.Filled.AdsClick,
    "AdUnits" to Icons.Filled.AdUnits,
    "Agriculture" to Icons.Filled.Agriculture,
    "Air" to Icons.Filled.Air,
    "AirlineSeatFlatAngled" to Icons.Filled.AirlineSeatFlatAngled,
    "AirlineSeatFlat" to Icons.Filled.AirlineSeatFlat,
    "AirlineSeatIndividualSuite" to Icons.Filled.AirlineSeatIndividualSuite,
    "AirlineSeatLegroomExtra" to Icons.Filled.AirlineSeatLegroomExtra,
    "AirlineSeatLegroomNormal" to Icons.Filled.AirlineSeatLegroomNormal,
    "AirlineSeatLegroomReduced" to Icons.Filled.AirlineSeatLegroomReduced,
    "AirlineSeatReclineExtra" to Icons.Filled.AirlineSeatReclineExtra,
    "AirlineSeatReclineNormal" to Icons.Filled.AirlineSeatReclineNormal,
    "Airlines" to Icons.Filled.Airlines,
    "AirlineStops" to Icons.Filled.AirlineStops,
    "AirplanemodeActive" to Icons.Filled.AirplanemodeActive,
    "AirplanemodeInactive" to Icons.Filled.AirplanemodeInactive,
    "AirplaneTicket" to Icons.AutoMirrored.Filled.AirplaneTicket,
    "Airplay" to Icons.Filled.Airplay,
    "AirportShuttle" to Icons.Filled.AirportShuttle,
    "AlarmAdd" to Icons.Filled.AlarmAdd,
    "Alarm" to Icons.Filled.Alarm,
    "AlarmOff" to Icons.Filled.AlarmOff,
    "AlarmOn" to Icons.Filled.AlarmOn,
    "Album" to Icons.Filled.Album,
    "AlignHorizontalCenter" to Icons.Filled.AlignHorizontalCenter,
    "AlignHorizontalLeft" to Icons.AutoMirrored.Filled.AlignHorizontalLeft,
    "AlignHorizontalRight" to Icons.AutoMirrored.Filled.AlignHorizontalRight,
    "AlignVerticalBottom" to Icons.Filled.AlignVerticalBottom,
    "AlignVerticalCenter" to Icons.Filled.AlignVerticalCenter,
    "AlignVerticalTop" to Icons.Filled.AlignVerticalTop,
    "AllInbox" to Icons.Filled.AllInbox,
    "AllInclusive" to Icons.Filled.AllInclusive,
    "AllOut" to Icons.Filled.AllOut,
    "AlternateEmail" to Icons.Filled.AlternateEmail,
    "AltRoute" to Icons.AutoMirrored.Filled.AltRoute,
    "AmpStories" to Icons.Filled.AmpStories,
    "Analytics" to Icons.Filled.Analytics,
    "Anchor" to Icons.Filled.Anchor,
    "Android" to Icons.Filled.Android,
    "Animation" to Icons.Filled.Animation,
    "Announcement" to Icons.AutoMirrored.Filled.Announcement,
    "Aod" to Icons.Filled.Aod,
    "Apartment" to Icons.Filled.Apartment,
    "Api" to Icons.Filled.Api,
    "AppBlocking" to Icons.Filled.AppBlocking,
    "AppRegistration" to Icons.Filled.AppRegistration,
    "Approval" to Icons.Filled.Approval,
    "AppSettingsAlt" to Icons.Filled.AppSettingsAlt,
    "AppShortcut" to Icons.Filled.AppShortcut,
    "Apps" to Icons.Filled.Apps,
    "AppsOutage" to Icons.Filled.AppsOutage,
    "Architecture" to Icons.Filled.Architecture,
    "Archive" to Icons.Filled.Archive,
    "AreaChart" to Icons.Filled.AreaChart,
    "ArrowBackIos" to Icons.AutoMirrored.Filled.ArrowBackIos,
    "ArrowBackIosNew" to Icons.Filled.ArrowBackIosNew,
    "ArrowCircleDown" to Icons.Filled.ArrowCircleDown,
    "ArrowCircleLeft" to Icons.Filled.ArrowCircleLeft,
    "ArrowCircleRight" to Icons.Filled.ArrowCircleRight,
    "ArrowCircleUp" to Icons.Filled.ArrowCircleUp,
    "ArrowDownward" to Icons.Filled.ArrowDownward,
    "ArrowDropDownCircle" to Icons.Filled.ArrowDropDownCircle,
    "ArrowDropUp" to Icons.Filled.ArrowDropUp,
    "ArrowForwardIos" to Icons.AutoMirrored.Filled.ArrowForwardIos,
    "ArrowLeft" to Icons.AutoMirrored.Filled.ArrowLeft,
    "ArrowOutward" to Icons.Filled.ArrowOutward,
    "ArrowRightAlt" to Icons.AutoMirrored.Filled.ArrowRightAlt,
    "ArrowRight" to Icons.AutoMirrored.Filled.ArrowRight,
    "ArrowUpward" to Icons.Filled.ArrowUpward,
    "Article" to Icons.AutoMirrored.Filled.Article,
    "ArtTrack" to Icons.Filled.ArtTrack,
    "AspectRatio" to Icons.Filled.AspectRatio,
    "Assessment" to Icons.Filled.Assessment,
    "AssignmentInd" to Icons.Filled.AssignmentInd,
    "Assignment" to Icons.AutoMirrored.Filled.Assignment,
    "AssignmentLate" to Icons.Filled.AssignmentLate,
    "AssignmentReturned" to Icons.Filled.AssignmentReturned,
    "AssignmentReturn" to Icons.AutoMirrored.Filled.AssignmentReturn,
    "AssignmentTurnedIn" to Icons.Filled.AssignmentTurnedIn,
    "AssistantDirection" to Icons.AutoMirrored.Filled.AssistantDirection,
    "Assistant" to Icons.Filled.Assistant,
    "AssistantPhoto" to Icons.Filled.AssistantPhoto,
    "AssistWalker" to Icons.Filled.AssistWalker,
    "AssuredWorkload" to Icons.Filled.AssuredWorkload,
    "Atm" to Icons.Filled.Atm,
    "AttachEmail" to Icons.Filled.AttachEmail,
    "AttachFile" to Icons.Filled.AttachFile,
    "Attachment" to Icons.Filled.Attachment,
    "AttachMoney" to Icons.Filled.AttachMoney,
    "Attractions" to Icons.Filled.Attractions,
    "Attribution" to Icons.Filled.Attribution,
    "AudioFile" to Icons.Filled.AudioFile,
    "Audiotrack" to Icons.Filled.Audiotrack,
    "AutoAwesome" to Icons.Filled.AutoAwesome,
    "AutoAwesomeMosaic" to Icons.Filled.AutoAwesomeMosaic,
    "AutoAwesomeMotion" to Icons.Filled.AutoAwesomeMotion,
    "AutoDelete" to Icons.Filled.AutoDelete,
    "AutoFixHigh" to Icons.Filled.AutoFixHigh,
    "AutoFixNormal" to Icons.Filled.AutoFixNormal,
    "AutoFixOff" to Icons.Filled.AutoFixOff,
    "AutofpsSelect" to Icons.Filled.AutofpsSelect,
    "AutoGraph" to Icons.Filled.AutoGraph,
    "AutoMode" to Icons.Filled.AutoMode,
    "Autorenew" to Icons.Filled.Autorenew,
    "AutoStories" to Icons.Filled.AutoStories,
    "AvTimer" to Icons.Filled.AvTimer,
    "BabyChangingStation" to Icons.Filled.BabyChangingStation,
    "BackHand" to Icons.Filled.BackHand,
    "Backpack" to Icons.Filled.Backpack,
    "Backspace" to Icons.AutoMirrored.Filled.Backspace,
    "Backup" to Icons.Filled.Backup,
    "BackupTable" to Icons.Filled.BackupTable,
    "Badge" to Icons.Filled.Badge,
    "BakeryDining" to Icons.Filled.BakeryDining,
    "Balance" to Icons.Filled.Balance,
    "Balcony" to Icons.Filled.Balcony,
    "Ballot" to Icons.Filled.Ballot,
    "BarChart" to Icons.Filled.BarChart,
    "BatchPrediction" to Icons.Filled.BatchPrediction,
    "Bathroom" to Icons.Filled.Bathroom,
    "Bathtub" to Icons.Filled.Bathtub,
    "Battery0Bar" to Icons.Filled.Battery0Bar,
    "Battery1Bar" to Icons.Filled.Battery1Bar,
    "Battery2Bar" to Icons.Filled.Battery2Bar,
    "Battery3Bar" to Icons.Filled.Battery3Bar,
    "Battery4Bar" to Icons.Filled.Battery4Bar,
    "Battery5Bar" to Icons.Filled.Battery5Bar,
    "Battery6Bar" to Icons.Filled.Battery6Bar,
    "BatteryAlert" to Icons.Filled.BatteryAlert,
    "BatteryChargingFull" to Icons.Filled.BatteryChargingFull,
    "BatteryFull" to Icons.Filled.BatteryFull,
    "BatterySaver" to Icons.Filled.BatterySaver,
    "BatteryStd" to Icons.Filled.BatteryStd,
    "BatteryUnknown" to Icons.AutoMirrored.Filled.BatteryUnknown,
    "BeachAccess" to Icons.Filled.BeachAccess,
    "Bed" to Icons.Filled.Bed,
    "BedroomBaby" to Icons.Filled.BedroomBaby,
    "BedroomChild" to Icons.Filled.BedroomChild,
    "BedroomParent" to Icons.Filled.BedroomParent,
    "Bedtime" to Icons.Filled.Bedtime,
    "BedtimeOff" to Icons.Filled.BedtimeOff,
    "Beenhere" to Icons.Filled.Beenhere,
    "Bento" to Icons.Filled.Bento,
    "BikeScooter" to Icons.Filled.BikeScooter,
    "Biotech" to Icons.Filled.Biotech,
    "Blender" to Icons.Filled.Blender,
    "Blind" to Icons.Filled.Blind,
    "BlindsClosed" to Icons.Filled.BlindsClosed,
    "Blinds" to Icons.Filled.Blinds,
    "Block" to Icons.Filled.Block,
    "Bloodtype" to Icons.Filled.Bloodtype,
    "BluetoothAudio" to Icons.Filled.BluetoothAudio,
    "BluetoothConnected" to Icons.Filled.BluetoothConnected,
    "BluetoothDisabled" to Icons.Filled.BluetoothDisabled,
    "BluetoothDrive" to Icons.Filled.BluetoothDrive,
    "Bluetooth" to Icons.Filled.Bluetooth,
    "BluetoothSearching" to Icons.AutoMirrored.Filled.BluetoothSearching,
    "BlurCircular" to Icons.Filled.BlurCircular,
    "BlurLinear" to Icons.Filled.BlurLinear,
    "BlurOff" to Icons.Filled.BlurOff,
    "BlurOn" to Icons.Filled.BlurOn,
    "Bolt" to Icons.Filled.Bolt,
    "Book" to Icons.Filled.Book,
    "BookmarkAdded" to Icons.Filled.BookmarkAdded,
    "BookmarkAdd" to Icons.Filled.BookmarkAdd,
    "BookmarkBorder" to Icons.Filled.BookmarkBorder,
    "Bookmark" to Icons.Filled.Bookmark,
    "BookmarkRemove" to Icons.Filled.BookmarkRemove,
    "Bookmarks" to Icons.Filled.Bookmarks,
    "BookOnline" to Icons.Filled.BookOnline,
    "BorderAll" to Icons.Filled.BorderAll,
    "BorderBottom" to Icons.Filled.BorderBottom,
    "BorderClear" to Icons.Filled.BorderClear,
    "BorderColor" to Icons.Filled.BorderColor,
    "BorderHorizontal" to Icons.Filled.BorderHorizontal,
    "BorderInner" to Icons.Filled.BorderInner,
    "BorderLeft" to Icons.Filled.BorderLeft,
    "BorderOuter" to Icons.Filled.BorderOuter,
    "BorderRight" to Icons.Filled.BorderRight,
    "BorderStyle" to Icons.Filled.BorderStyle,
    "BorderTop" to Icons.Filled.BorderTop,
    "BorderVertical" to Icons.Filled.BorderVertical,
    "Boy" to Icons.Filled.Boy,
    "BrandingWatermark" to Icons.AutoMirrored.Filled.BrandingWatermark,
    "BreakfastDining" to Icons.Filled.BreakfastDining,
    "Brightness1" to Icons.Filled.Brightness1,
    "Brightness2" to Icons.Filled.Brightness2,
    "Brightness3" to Icons.Filled.Brightness3,
    "Brightness4" to Icons.Filled.Brightness4,
    "Brightness5" to Icons.Filled.Brightness5,
    "Brightness6" to Icons.Filled.Brightness6,
    "Brightness7" to Icons.Filled.Brightness7,
    "BrightnessAuto" to Icons.Filled.BrightnessAuto,
    "BrightnessHigh" to Icons.Filled.BrightnessHigh,
    "BrightnessLow" to Icons.Filled.BrightnessLow,
    "BrightnessMedium" to Icons.Filled.BrightnessMedium,
    "BroadcastOnHome" to Icons.Filled.BroadcastOnHome,
    "BroadcastOnPersonal" to Icons.Filled.BroadcastOnPersonal,
    "BrokenImage" to Icons.Filled.BrokenImage,
    "BrowseGallery" to Icons.Filled.BrowseGallery,
    "BrowserNotSupported" to Icons.Filled.BrowserNotSupported,
    "BrowserUpdated" to Icons.Filled.BrowserUpdated,
    "BrunchDining" to Icons.Filled.BrunchDining,
    "Brush" to Icons.Filled.Brush,
    "BubbleChart" to Icons.Filled.BubbleChart,
    "BugReport" to Icons.Filled.BugReport,
    "BuildCircle" to Icons.Filled.BuildCircle,
    "Bungalow" to Icons.Filled.Bungalow,
    "BurstMode" to Icons.Filled.BurstMode,
    "BusAlert" to Icons.Filled.BusAlert,
    "BusinessCenter" to Icons.Filled.BusinessCenter,
    "Business" to Icons.Filled.Business,
    "Cabin" to Icons.Filled.Cabin,
    "Cable" to Icons.Filled.Cable,
    "Cached" to Icons.Filled.Cached,
    "Cake" to Icons.Filled.Cake,
    "Calculate" to Icons.Filled.Calculate,
    "CalendarMonth" to Icons.Filled.CalendarMonth,
    "CalendarToday" to Icons.Filled.CalendarToday,
    "CalendarViewDay" to Icons.Filled.CalendarViewDay,
    "CalendarViewMonth" to Icons.Filled.CalendarViewMonth,
    "CalendarViewWeek" to Icons.Filled.CalendarViewWeek,
    "CallEnd" to Icons.Filled.CallEnd,
    "CallMade" to Icons.AutoMirrored.Filled.CallMade,
    "CallMerge" to Icons.AutoMirrored.Filled.CallMerge,
    "CallMissed" to Icons.AutoMirrored.Filled.CallMissed,
    "CallMissedOutgoing" to Icons.AutoMirrored.Filled.CallMissedOutgoing,
    "CallReceived" to Icons.AutoMirrored.Filled.CallReceived,
    "CallSplit" to Icons.AutoMirrored.Filled.CallSplit,
    "CallToAction" to Icons.Filled.CallToAction,
    "CameraAlt" to Icons.Filled.CameraAlt,
    "CameraEnhance" to Icons.Filled.CameraEnhance,
    "CameraFront" to Icons.Filled.CameraFront,
    "CameraIndoor" to Icons.Filled.CameraIndoor,
    "Camera" to Icons.Filled.Camera,
    "CameraOutdoor" to Icons.Filled.CameraOutdoor,
    "CameraRear" to Icons.Filled.CameraRear,
    "CameraRoll" to Icons.Filled.CameraRoll,
    "Cameraswitch" to Icons.Filled.Cameraswitch,
    "Campaign" to Icons.Filled.Campaign,
    "Cancel" to Icons.Filled.Cancel,
    "CancelPresentation" to Icons.Filled.CancelPresentation,
    "CancelScheduleSend" to Icons.Filled.CancelScheduleSend,
    "CandlestickChart" to Icons.Filled.CandlestickChart,
    "CarCrash" to Icons.Filled.CarCrash,
    "CardGiftcard" to Icons.Filled.CardGiftcard,
    "CardMembership" to Icons.Filled.CardMembership,
    "CardTravel" to Icons.Filled.CardTravel,
    "Carpenter" to Icons.Filled.Carpenter,
    "CarRental" to Icons.Filled.CarRental,
    "CarRepair" to Icons.Filled.CarRepair,
    "Cases" to Icons.Filled.Cases,
    "Casino" to Icons.Filled.Casino,
    "CastConnected" to Icons.Filled.CastConnected,
    "CastForEducation" to Icons.Filled.CastForEducation,
    "Cast" to Icons.Filled.Cast,
    "Castle" to Icons.Filled.Castle,
    "CatchingPokemon" to Icons.Filled.CatchingPokemon,
    "Category" to Icons.Filled.Category,
    "Celebration" to Icons.Filled.Celebration,
    "CellTower" to Icons.Filled.CellTower,
    "CellWifi" to Icons.Filled.CellWifi,
    "CenterFocusStrong" to Icons.Filled.CenterFocusStrong,
    "CenterFocusWeak" to Icons.Filled.CenterFocusWeak,
    "ChairAlt" to Icons.Filled.ChairAlt,
    "Chair" to Icons.Filled.Chair,
    "Chalet" to Icons.Filled.Chalet,
    "ChangeCircle" to Icons.Filled.ChangeCircle,
    "ChangeHistory" to Icons.Filled.ChangeHistory,
    "ChargingStation" to Icons.Filled.ChargingStation,
    "ChatBubble" to Icons.Filled.ChatBubble,
    "ChatBubbleOutline" to Icons.Filled.ChatBubbleOutline,
    "Chat" to Icons.AutoMirrored.Filled.Chat,
    "CheckBox" to Icons.Filled.CheckBox,
    "CheckBoxOutlineBlank" to Icons.Filled.CheckBoxOutlineBlank,
    "CheckCircleOutline" to Icons.Filled.CheckCircleOutline,
    "Checklist" to Icons.Filled.Checklist,
    "ChecklistRtl" to Icons.Filled.ChecklistRtl,
    "Checkroom" to Icons.Filled.Checkroom,
    "ChevronLeft" to Icons.Filled.ChevronLeft,
    "ChevronRight" to Icons.Filled.ChevronRight,
    "ChildCare" to Icons.Filled.ChildCare,
    "ChildFriendly" to Icons.Filled.ChildFriendly,
    "ChromeReaderMode" to Icons.AutoMirrored.Filled.ChromeReaderMode,
    "Church" to Icons.Filled.Church,
    "Circle" to Icons.Filled.Circle,
    "CircleNotifications" to Icons.Filled.CircleNotifications,
    "Class" to Icons.Filled.Class,
    "CleanHands" to Icons.Filled.CleanHands,
    "CleaningServices" to Icons.Filled.CleaningServices,
    "ClearAll" to Icons.Filled.ClearAll,
    "ClosedCaptionDisabled" to Icons.Filled.ClosedCaptionDisabled,
    "ClosedCaption" to Icons.Filled.ClosedCaption,
    "ClosedCaptionOff" to Icons.Filled.ClosedCaptionOff,
    "CloseFullscreen" to Icons.Filled.CloseFullscreen,
    "CloudCircle" to Icons.Filled.CloudCircle,
    "CloudDone" to Icons.Filled.CloudDone,
    "CloudDownload" to Icons.Filled.CloudDownload,
    "Cloud" to Icons.Filled.Cloud,
    "CloudOff" to Icons.Filled.CloudOff,
    "CloudQueue" to Icons.Filled.CloudQueue,
    "CloudSync" to Icons.Filled.CloudSync,
    "CloudUpload" to Icons.Filled.CloudUpload,
    "Co2" to Icons.Filled.Co2,
    "Code" to Icons.Filled.Code,
    "CodeOff" to Icons.Filled.CodeOff,
    "Coffee" to Icons.Filled.Coffee,
    "CoffeeMaker" to Icons.Filled.CoffeeMaker,
    "CollectionsBookmark" to Icons.Filled.CollectionsBookmark,
    "Collections" to Icons.Filled.Collections,
    "Colorize" to Icons.Filled.Colorize,
    "ColorLens" to Icons.Filled.ColorLens,
    "CommentBank" to Icons.Filled.CommentBank,
    "Comment" to Icons.AutoMirrored.Filled.Comment,
    "CommentsDisabled" to Icons.Filled.CommentsDisabled,
    "Commit" to Icons.Filled.Commit,
    "Commute" to Icons.Filled.Commute,
    "CompareArrows" to Icons.AutoMirrored.Filled.CompareArrows,
    "Compare" to Icons.Filled.Compare,
    "CompassCalibration" to Icons.Filled.CompassCalibration,
    "Compost" to Icons.Filled.Compost,
    "Compress" to Icons.Filled.Compress,
    "Computer" to Icons.Filled.Computer,
    "ConfirmationNumber" to Icons.Filled.ConfirmationNumber,
    "ConnectedTv" to Icons.Filled.ConnectedTv,
    "ConnectingAirports" to Icons.Filled.ConnectingAirports,
    "ConnectWithoutContact" to Icons.Filled.ConnectWithoutContact,
    "Construction" to Icons.Filled.Construction,
    "ContactEmergency" to Icons.Filled.ContactEmergency,
    "Contactless" to Icons.Filled.Contactless,
    "ContactMail" to Icons.Filled.ContactMail,
    "ContactPage" to Icons.Filled.ContactPage,
    "ContactPhone" to Icons.Filled.ContactPhone,
    "Contacts" to Icons.Filled.Contacts,
    "ContactSupport" to Icons.AutoMirrored.Filled.ContactSupport,
    "ContentCopy" to Icons.Filled.ContentCopy,
    "ContentCut" to Icons.Filled.ContentCut,
    "ContentPasteGo" to Icons.Filled.ContentPasteGo,
    "ContentPaste" to Icons.Filled.ContentPaste,
    "ContentPasteOff" to Icons.Filled.ContentPasteOff,
    "ContentPasteSearch" to Icons.Filled.ContentPasteSearch,
    "Contrast" to Icons.Filled.Contrast,
    "ControlCamera" to Icons.Filled.ControlCamera,
    "ControlPointDuplicate" to Icons.Filled.ControlPointDuplicate,
    "ControlPoint" to Icons.Filled.ControlPoint,
    "Cookie" to Icons.Filled.Cookie,
    "CoPresent" to Icons.Filled.CoPresent,
    "CopyAll" to Icons.Filled.CopyAll,
    "Copyright" to Icons.Filled.Copyright,
    "Coronavirus" to Icons.Filled.Coronavirus,
    "CorporateFare" to Icons.Filled.CorporateFare,
    "Cottage" to Icons.Filled.Cottage,
    "Countertops" to Icons.Filled.Countertops,
    "CreateNewFolder" to Icons.Filled.CreateNewFolder,
    "CreditCard" to Icons.Filled.CreditCard,
    "CreditCardOff" to Icons.Filled.CreditCardOff,
    "CreditScore" to Icons.Filled.CreditScore,
    "Crib" to Icons.Filled.Crib,
    "CrisisAlert" to Icons.Filled.CrisisAlert,
    "Crop32" to Icons.Filled.Crop32,
    "Crop54" to Icons.Filled.Crop54,
    "Crop75" to Icons.Filled.Crop75,
    "Crop169" to Icons.Filled.Crop169,
    "CropDin" to Icons.Filled.CropDin,
    "CropFree" to Icons.Filled.CropFree,
    "Crop" to Icons.Filled.Crop,
    "CropLandscape" to Icons.Filled.CropLandscape,
    "CropOriginal" to Icons.Filled.CropOriginal,
    "CropPortrait" to Icons.Filled.CropPortrait,
    "CropRotate" to Icons.Filled.CropRotate,
    "CropSquare" to Icons.Filled.CropSquare,
    "CrueltyFree" to Icons.Filled.CrueltyFree,
    "Css" to Icons.Filled.Css,
    "CurrencyBitcoin" to Icons.Filled.CurrencyBitcoin,
    "CurrencyExchange" to Icons.Filled.CurrencyExchange,
    "CurrencyFranc" to Icons.Filled.CurrencyFranc,
    "CurrencyLira" to Icons.Filled.CurrencyLira,
    "CurrencyPound" to Icons.Filled.CurrencyPound,
    "CurrencyRuble" to Icons.Filled.CurrencyRuble,
    "CurrencyRupee" to Icons.Filled.CurrencyRupee,
    "CurrencyYen" to Icons.Filled.CurrencyYen,
    "CurrencyYuan" to Icons.Filled.CurrencyYuan,
    "CurtainsClosed" to Icons.Filled.CurtainsClosed,
    "Curtains" to Icons.Filled.Curtains,
    "Cyclone" to Icons.Filled.Cyclone,
    "Dangerous" to Icons.Filled.Dangerous,
    "DarkMode" to Icons.Filled.DarkMode,
    "DashboardCustomize" to Icons.Filled.DashboardCustomize,
    "Dashboard" to Icons.Filled.Dashboard,
    "DataArray" to Icons.Filled.DataArray,
    "DataExploration" to Icons.Filled.DataExploration,
    "DataObject" to Icons.Filled.DataObject,
    "DataSaverOff" to Icons.Filled.DataSaverOff,
    "DataSaverOn" to Icons.Filled.DataSaverOn,
    "Dataset" to Icons.Filled.Dataset,
    "DatasetLinked" to Icons.Filled.DatasetLinked,
    "DataThresholding" to Icons.Filled.DataThresholding,
    "DataUsage" to Icons.Filled.DataUsage,
    "Deblur" to Icons.Filled.Deblur,
    "Deck" to Icons.Filled.Deck,
    "Dehaze" to Icons.Filled.Dehaze,
    "DeleteForever" to Icons.Filled.DeleteForever,
    "DeleteOutline" to Icons.Filled.DeleteOutline,
    "DeleteSweep" to Icons.Filled.DeleteSweep,
    "DeliveryDining" to Icons.Filled.DeliveryDining,
    "DensityLarge" to Icons.Filled.DensityLarge,
    "DensityMedium" to Icons.Filled.DensityMedium,
    "DensitySmall" to Icons.Filled.DensitySmall,
    "DepartureBoard" to Icons.Filled.DepartureBoard,
    "Description" to Icons.Filled.Description,
    "Deselect" to Icons.Filled.Deselect,
    "DesignServices" to Icons.Filled.DesignServices,
    "Desk" to Icons.Filled.Desk,
    "DesktopAccessDisabled" to Icons.Filled.DesktopAccessDisabled,
    "DesktopMac" to Icons.Filled.DesktopMac,
    "DesktopWindows" to Icons.Filled.DesktopWindows,
    "Details" to Icons.Filled.Details,
    "DeveloperBoard" to Icons.Filled.DeveloperBoard,
    "DeveloperBoardOff" to Icons.Filled.DeveloperBoardOff,
    "DeveloperMode" to Icons.Filled.DeveloperMode,
    "DeviceHub" to Icons.Filled.DeviceHub,
    "DevicesFold" to Icons.Filled.DevicesFold,
    "Devices" to Icons.Filled.Devices,
    "DevicesOther" to Icons.Filled.DevicesOther,
    "DeviceThermostat" to Icons.Filled.DeviceThermostat,
    "DeviceUnknown" to Icons.Filled.DeviceUnknown,
    "DialerSip" to Icons.Filled.DialerSip,
    "Dialpad" to Icons.Filled.Dialpad,
    "Diamond" to Icons.Filled.Diamond,
    "Difference" to Icons.Filled.Difference,
    "Dining" to Icons.Filled.Dining,
    "DinnerDining" to Icons.Filled.DinnerDining,
    "DirectionsBike" to Icons.AutoMirrored.Filled.DirectionsBike,
    "DirectionsBoatFilled" to Icons.Filled.DirectionsBoatFilled,
    "DirectionsBoat" to Icons.Filled.DirectionsBoat,
    "DirectionsBusFilled" to Icons.Filled.DirectionsBusFilled,
    "DirectionsBus" to Icons.Filled.DirectionsBus,
    "DirectionsCarFilled" to Icons.Filled.DirectionsCarFilled,
    "DirectionsCar" to Icons.Filled.DirectionsCar,
    "Directions" to Icons.Filled.Directions,
    "DirectionsOff" to Icons.Filled.DirectionsOff,
    "DirectionsRailwayFilled" to Icons.Filled.DirectionsRailwayFilled,
    "DirectionsRailway" to Icons.Filled.DirectionsRailway,
    "DirectionsRun" to Icons.AutoMirrored.Filled.DirectionsRun,
    "DirectionsSubwayFilled" to Icons.Filled.DirectionsSubwayFilled,
    "DirectionsSubway" to Icons.Filled.DirectionsSubway,
    "DirectionsTransitFilled" to Icons.Filled.DirectionsTransitFilled,
    "DirectionsTransit" to Icons.Filled.DirectionsTransit,
    "DirectionsWalk" to Icons.AutoMirrored.Filled.DirectionsWalk,
    "DirtyLens" to Icons.Filled.DirtyLens,
    "DisabledByDefault" to Icons.Filled.DisabledByDefault,
    "DisabledVisible" to Icons.Filled.DisabledVisible,
    "DiscFull" to Icons.Filled.DiscFull,
    "Discount" to Icons.Filled.Discount,
    "DisplaySettings" to Icons.Filled.DisplaySettings,
    "Diversity1" to Icons.Filled.Diversity1,
    "Diversity2" to Icons.Filled.Diversity2,
    "Diversity3" to Icons.Filled.Diversity3,
    "Dns" to Icons.Filled.Dns,
    "Dock" to Icons.Filled.Dock,
    "DocumentScanner" to Icons.Filled.DocumentScanner,
    "DoDisturbAlt" to Icons.Filled.DoDisturbAlt,
    "DoDisturb" to Icons.Filled.DoDisturb,
    "DoDisturbOff" to Icons.Filled.DoDisturbOff,
    "DoDisturbOn" to Icons.Filled.DoDisturbOn,
    "DomainAdd" to Icons.Filled.DomainAdd,
    "DomainDisabled" to Icons.Filled.DomainDisabled,
    "Domain" to Icons.Filled.Domain,
    "DomainVerification" to Icons.Filled.DomainVerification,
    "DoneAll" to Icons.Filled.DoneAll,
    "DoneOutline" to Icons.Filled.DoneOutline,
    "DoNotDisturbAlt" to Icons.Filled.DoNotDisturbAlt,
    "DoNotDisturb" to Icons.Filled.DoNotDisturb,
    "DoNotDisturbOff" to Icons.Filled.DoNotDisturbOff,
    "DoNotDisturbOn" to Icons.Filled.DoNotDisturbOn,
    "DoNotDisturbOnTotalSilence" to Icons.Filled.DoNotDisturbOnTotalSilence,
    "DoNotStep" to Icons.Filled.DoNotStep,
    "DoNotTouch" to Icons.Filled.DoNotTouch,
    "DonutLarge" to Icons.Filled.DonutLarge,
    "DonutSmall" to Icons.Filled.DonutSmall,
    "DoorBack" to Icons.Filled.DoorBack,
    "Doorbell" to Icons.Filled.Doorbell,
    "DoorFront" to Icons.Filled.DoorFront,
    "DoorSliding" to Icons.Filled.DoorSliding,
    "DoubleArrow" to Icons.Filled.DoubleArrow,
    "DownhillSkiing" to Icons.Filled.DownhillSkiing,
    "DownloadDone" to Icons.Filled.DownloadDone,
    "DownloadForOffline" to Icons.Filled.DownloadForOffline,
    "Downloading" to Icons.Filled.Downloading,
    "Download" to Icons.Filled.Download,
    "Drafts" to Icons.Filled.Drafts,
    "DragHandle" to Icons.Filled.DragHandle,
    "DragIndicator" to Icons.Filled.DragIndicator,
    "Draw" to Icons.Filled.Draw,
    "DriveEta" to Icons.Filled.DriveEta,
    "DriveFileMove" to Icons.AutoMirrored.Filled.DriveFileMove,
    "DriveFileMoveRtl" to Icons.Filled.DriveFileMoveRtl,
    "DriveFileRenameOutline" to Icons.Filled.DriveFileRenameOutline,
    "DriveFolderUpload" to Icons.Filled.DriveFolderUpload,
    "DryCleaning" to Icons.Filled.DryCleaning,
    "Dry" to Icons.Filled.Dry,
    "Duo" to Icons.Filled.Duo,
    "Dvr" to Icons.AutoMirrored.Filled.Dvr,
    "DynamicFeed" to Icons.Filled.DynamicFeed,
    "DynamicForm" to Icons.Filled.DynamicForm,
    "EarbudsBattery" to Icons.Filled.EarbudsBattery,
    "Earbuds" to Icons.Filled.Earbuds,
    "East" to Icons.Filled.East,
    "Eco" to Icons.Filled.Eco,
    "EdgesensorHigh" to Icons.Filled.EdgesensorHigh,
    "EdgesensorLow" to Icons.Filled.EdgesensorLow,
    "EditAttributes" to Icons.Filled.EditAttributes,
    "EditCalendar" to Icons.Filled.EditCalendar,
    "EditLocationAlt" to Icons.Filled.EditLocationAlt,
    "EditLocation" to Icons.Filled.EditLocation,
    "EditNote" to Icons.Filled.EditNote,
    "EditNotifications" to Icons.Filled.EditNotifications,
    "EditOff" to Icons.Filled.EditOff,
    "EditRoad" to Icons.Filled.EditRoad,
    "EggAlt" to Icons.Filled.EggAlt,
    "Egg" to Icons.Filled.Egg,
    "Eject" to Icons.Filled.Eject,
    "Elderly" to Icons.Filled.Elderly,
    "ElderlyWoman" to Icons.Filled.ElderlyWoman,
    "ElectricalServices" to Icons.Filled.ElectricalServices,
    "ElectricBike" to Icons.Filled.ElectricBike,
    "ElectricBolt" to Icons.Filled.ElectricBolt,
    "ElectricCar" to Icons.Filled.ElectricCar,
    "ElectricMeter" to Icons.Filled.ElectricMeter,
    "ElectricMoped" to Icons.Filled.ElectricMoped,
    "ElectricRickshaw" to Icons.Filled.ElectricRickshaw,
    "ElectricScooter" to Icons.Filled.ElectricScooter,
    "Elevator" to Icons.Filled.Elevator,
    "Emergency" to Icons.Filled.Emergency,
    "EmergencyRecording" to Icons.Filled.EmergencyRecording,
    "EmergencyShare" to Icons.Filled.EmergencyShare,
    "EMobiledata" to Icons.Filled.EMobiledata,
    "EmojiEmotions" to Icons.Filled.EmojiEmotions,
    "EmojiEvents" to Icons.Filled.EmojiEvents,
    "EmojiFlags" to Icons.Filled.EmojiFlags,
    "EmojiFoodBeverage" to Icons.Filled.EmojiFoodBeverage,
    "EmojiNature" to Icons.Filled.EmojiNature,
    "EmojiObjects" to Icons.Filled.EmojiObjects,
    "EmojiPeople" to Icons.Filled.EmojiPeople,
    "EmojiSymbols" to Icons.Filled.EmojiSymbols,
    "EmojiTransportation" to Icons.Filled.EmojiTransportation,
    "EnergySavingsLeaf" to Icons.Filled.EnergySavingsLeaf,
    "Engineering" to Icons.Filled.Engineering,
    "EnhancedEncryption" to Icons.Filled.EnhancedEncryption,
    "Equalizer" to Icons.Filled.Equalizer,
    "Error" to Icons.Filled.Error,
    "ErrorOutline" to Icons.Filled.ErrorOutline,
    "Escalator" to Icons.Filled.Escalator,
    "EscalatorWarning" to Icons.Filled.EscalatorWarning,
    "Euro" to Icons.Filled.Euro,
    "EuroSymbol" to Icons.Filled.EuroSymbol,
    "EventAvailable" to Icons.Filled.EventAvailable,
    "EventBusy" to Icons.Filled.EventBusy,
    "Event" to Icons.Filled.Event,
    "EventNote" to Icons.AutoMirrored.Filled.EventNote,
    "EventRepeat" to Icons.Filled.EventRepeat,
    "EventSeat" to Icons.Filled.EventSeat,
    "EvStation" to Icons.Filled.EvStation,
    "ExpandCircleDown" to Icons.Filled.ExpandCircleDown,
    "Expand" to Icons.Filled.Expand,
    "ExpandLess" to Icons.Filled.ExpandLess,
    "ExpandMore" to Icons.Filled.ExpandMore,
    "Explicit" to Icons.Filled.Explicit,
    "Explore" to Icons.Filled.Explore,
    "ExploreOff" to Icons.Filled.ExploreOff,
    "Exposure" to Icons.Filled.Exposure,
    "ExposureNeg1" to Icons.Filled.ExposureNeg1,
    "ExposureNeg2" to Icons.Filled.ExposureNeg2,
    "ExposurePlus1" to Icons.Filled.ExposurePlus1,
    "ExposurePlus2" to Icons.Filled.ExposurePlus2,
    "ExposureZero" to Icons.Filled.ExposureZero,
    "Extension" to Icons.Filled.Extension,
    "ExtensionOff" to Icons.Filled.ExtensionOff,
    "Face" to Icons.Filled.Face,
    "Face2" to Icons.Filled.Face2,
    "Face3" to Icons.Filled.Face3,
    "Face4" to Icons.Filled.Face4,
    "Face5" to Icons.Filled.Face5,
    "Face6" to Icons.Filled.Face6,
    "Facebook" to Icons.Filled.Facebook,
    "FaceRetouchingNatural" to Icons.Filled.FaceRetouchingNatural,
    "FaceRetouchingOff" to Icons.Filled.FaceRetouchingOff,
    "FactCheck" to Icons.AutoMirrored.Filled.FactCheck,
    "Factory" to Icons.Filled.Factory,
    "FamilyRestroom" to Icons.Filled.FamilyRestroom,
    "Fastfood" to Icons.Filled.Fastfood,
    "FastForward" to Icons.Filled.FastForward,
    "FastRewind" to Icons.Filled.FastRewind,
    "Fax" to Icons.Filled.Fax,
    "FeaturedPlayList" to Icons.AutoMirrored.Filled.FeaturedPlayList,
    "FeaturedVideo" to Icons.AutoMirrored.Filled.FeaturedVideo,
    "Feedback" to Icons.Filled.Feedback,
    "Feed" to Icons.AutoMirrored.Filled.Feed,
    "Female" to Icons.Filled.Female,
    "Fence" to Icons.Filled.Fence,
    "Festival" to Icons.Filled.Festival,
    "FiberDvr" to Icons.Filled.FiberDvr,
    "FiberManualRecord" to Icons.Filled.FiberManualRecord,
    "FiberNew" to Icons.Filled.FiberNew,
    "FiberPin" to Icons.Filled.FiberPin,
    "FiberSmartRecord" to Icons.Filled.FiberSmartRecord,
    "FileCopy" to Icons.Filled.FileCopy,
    "FileDownloadDone" to Icons.Filled.FileDownloadDone,
    "FileDownload" to Icons.Filled.FileDownload,
    "FileDownloadOff" to Icons.Filled.FileDownloadOff,
    "FileOpen" to Icons.Filled.FileOpen,
    "FilePresent" to Icons.Filled.FilePresent,
    "FileUpload" to Icons.Filled.FileUpload,
    "Filter1" to Icons.Filled.Filter1,
    "Filter2" to Icons.Filled.Filter2,
    "Filter3" to Icons.Filled.Filter3,
    "Filter4" to Icons.Filled.Filter4,
    "Filter5" to Icons.Filled.Filter5,
    "Filter6" to Icons.Filled.Filter6,
    "Filter7" to Icons.Filled.Filter7,
    "Filter8" to Icons.Filled.Filter8,
    "Filter9" to Icons.Filled.Filter9,
    "Filter9Plus" to Icons.Filled.Filter9Plus,
    "FilterAlt" to Icons.Filled.FilterAlt,
    "FilterAltOff" to Icons.Filled.FilterAltOff,
    "FilterBAndW" to Icons.Filled.FilterBAndW,
    "FilterCenterFocus" to Icons.Filled.FilterCenterFocus,
    "FilterDrama" to Icons.Filled.FilterDrama,
    "FilterFrames" to Icons.Filled.FilterFrames,
    "FilterHdr" to Icons.Filled.FilterHdr,
    "Filter" to Icons.Filled.Filter,
    "FilterList" to Icons.Filled.FilterList,
    "FilterListOff" to Icons.Filled.FilterListOff,
    "FilterNone" to Icons.Filled.FilterNone,
    "FilterTiltShift" to Icons.Filled.FilterTiltShift,
    "FilterVintage" to Icons.Filled.FilterVintage,
    "FindInPage" to Icons.Filled.FindInPage,
    "FindReplace" to Icons.Filled.FindReplace,
    "Fingerprint" to Icons.Filled.Fingerprint,
    "FireExtinguisher" to Icons.Filled.FireExtinguisher,
    "FireHydrantAlt" to Icons.Filled.FireHydrantAlt,
    "Fireplace" to Icons.Filled.Fireplace,
    "FireTruck" to Icons.Filled.FireTruck,
    "FirstPage" to Icons.Filled.FirstPage,
    "Fitbit" to Icons.Filled.Fitbit,
    "FitnessCenter" to Icons.Filled.FitnessCenter,
    "FitScreen" to Icons.Filled.FitScreen,
    "FlagCircle" to Icons.Filled.FlagCircle,
    "Flag" to Icons.Filled.Flag,
    "Flaky" to Icons.Filled.Flaky,
    "Flare" to Icons.Filled.Flare,
    "FlashAuto" to Icons.Filled.FlashAuto,
    "FlashlightOff" to Icons.Filled.FlashlightOff,
    "FlashlightOn" to Icons.Filled.FlashlightOn,
    "FlashOff" to Icons.Filled.FlashOff,
    "FlashOn" to Icons.Filled.FlashOn,
    "Flatware" to Icons.Filled.Flatware,
    "FlightClass" to Icons.Filled.FlightClass,
    "Flight" to Icons.Filled.Flight,
    "FlightLand" to Icons.Filled.FlightLand,
    "FlightTakeoff" to Icons.Filled.FlightTakeoff,
    "FlipCameraAndroid" to Icons.Filled.FlipCameraAndroid,
    "FlipCameraIos" to Icons.Filled.FlipCameraIos,
    "Flip" to Icons.Filled.Flip,
    "FlipToBack" to Icons.Filled.FlipToBack,
    "FlipToFront" to Icons.Filled.FlipToFront,
    "Flood" to Icons.Filled.Flood,
    "Flourescent" to Icons.Filled.Flourescent,
    "Fluorescent" to Icons.Filled.Fluorescent,
    "FlutterDash" to Icons.Filled.FlutterDash,
    "FmdBad" to Icons.Filled.FmdBad,
    "FmdGood" to Icons.Filled.FmdGood,
    "FolderCopy" to Icons.Filled.FolderCopy,
    "FolderDelete" to Icons.Filled.FolderDelete,
    "Folder" to Icons.Filled.Folder,
    "FolderOff" to Icons.Filled.FolderOff,
    "FolderOpen" to Icons.Filled.FolderOpen,
    "FolderShared" to Icons.Filled.FolderShared,
    "FolderSpecial" to Icons.Filled.FolderSpecial,
    "FolderZip" to Icons.Filled.FolderZip,
    "FollowTheSigns" to Icons.AutoMirrored.Filled.FollowTheSigns,
    "FontDownload" to Icons.Filled.FontDownload,
    "FontDownloadOff" to Icons.Filled.FontDownloadOff,
    "FoodBank" to Icons.Filled.FoodBank,
    "Forest" to Icons.Filled.Forest,
    "ForkLeft" to Icons.Filled.ForkLeft,
    "ForkRight" to Icons.Filled.ForkRight,
    "FormatAlignCenter" to Icons.Filled.FormatAlignCenter,
    "FormatAlignJustify" to Icons.Filled.FormatAlignJustify,
    "FormatAlignLeft" to Icons.AutoMirrored.Filled.FormatAlignLeft,
    "FormatAlignRight" to Icons.AutoMirrored.Filled.FormatAlignRight,
    "FormatBold" to Icons.Filled.FormatBold,
    "FormatClear" to Icons.Filled.FormatClear,
    "FormatColorFill" to Icons.Filled.FormatColorFill,
    "FormatColorReset" to Icons.Filled.FormatColorReset,
    "FormatColorText" to Icons.Filled.FormatColorText,
    "FormatIndentDecrease" to Icons.AutoMirrored.Filled.FormatIndentDecrease,
    "FormatIndentIncrease" to Icons.AutoMirrored.Filled.FormatIndentIncrease,
    "FormatItalic" to Icons.Filled.FormatItalic,
    "FormatLineSpacing" to Icons.Filled.FormatLineSpacing,
    "FormatListBulleted" to Icons.AutoMirrored.Filled.FormatListBulleted,
    "FormatListNumbered" to Icons.Filled.FormatListNumbered,
    "FormatListNumberedRtl" to Icons.Filled.FormatListNumberedRtl,
    "FormatOverline" to Icons.Filled.FormatOverline,
    "FormatPaint" to Icons.Filled.FormatPaint,
    "FormatQuote" to Icons.Filled.FormatQuote,
    "FormatShapes" to Icons.Filled.FormatShapes,
    "FormatSize" to Icons.Filled.FormatSize,
    "FormatStrikethrough" to Icons.Filled.FormatStrikethrough,
    "FormatTextdirectionLToR" to Icons.AutoMirrored.Filled.FormatTextdirectionLToR,
    "FormatTextdirectionRToL" to Icons.AutoMirrored.Filled.FormatTextdirectionRToL,
    "FormatUnderlined" to Icons.Filled.FormatUnderlined,
    "Fort" to Icons.Filled.Fort,
    "Forum" to Icons.Filled.Forum,
    "Forward5" to Icons.Filled.Forward5,
    "Forward10" to Icons.Filled.Forward10,
    "Forward30" to Icons.Filled.Forward30,
    "Forward" to Icons.AutoMirrored.Filled.Forward,
    "ForwardToInbox" to Icons.AutoMirrored.Filled.ForwardToInbox,
    "Foundation" to Icons.Filled.Foundation,
    "FreeBreakfast" to Icons.Filled.FreeBreakfast,
    "FreeCancellation" to Icons.Filled.FreeCancellation,
    "FrontHand" to Icons.Filled.FrontHand,
    "FullscreenExit" to Icons.Filled.FullscreenExit,
    "Fullscreen" to Icons.Filled.Fullscreen,
    "Functions" to Icons.Filled.Functions,
    "Gamepad" to Icons.Filled.Gamepad,
    "Games" to Icons.Filled.Games,
    "Garage" to Icons.Filled.Garage,
    "GasMeter" to Icons.Filled.GasMeter,
    "Gavel" to Icons.Filled.Gavel,
    "GeneratingTokens" to Icons.Filled.GeneratingTokens,
    "Gesture" to Icons.Filled.Gesture,
    "GetApp" to Icons.Filled.GetApp,
    "GifBox" to Icons.Filled.GifBox,
    "Gif" to Icons.Filled.Gif,
    "Girl" to Icons.Filled.Girl,
    "Gite" to Icons.Filled.Gite,
    "GMobiledata" to Icons.Filled.GMobiledata,
    "GolfCourse" to Icons.Filled.GolfCourse,
    "GppBad" to Icons.Filled.GppBad,
    "GppGood" to Icons.Filled.GppGood,
    "GppMaybe" to Icons.Filled.GppMaybe,
    "GpsFixed" to Icons.Filled.GpsFixed,
    "GpsNotFixed" to Icons.Filled.GpsNotFixed,
    "GpsOff" to Icons.Filled.GpsOff,
    "Grade" to Icons.Filled.Grade,
    "Gradient" to Icons.Filled.Gradient,
    "Grading" to Icons.AutoMirrored.Filled.Grading,
    "Grain" to Icons.Filled.Grain,
    "GraphicEq" to Icons.Filled.GraphicEq,
    "Grass" to Icons.Filled.Grass,
    "Grid3x3" to Icons.Filled.Grid3x3,
    "Grid4x4" to Icons.Filled.Grid4x4,
    "GridGoldenratio" to Icons.Filled.GridGoldenratio,
    "GridOff" to Icons.Filled.GridOff,
    "GridOn" to Icons.Filled.GridOn,
    "GridView" to Icons.Filled.GridView,
    "GroupAdd" to Icons.Filled.GroupAdd,
    "Group" to Icons.Filled.Group,
    "GroupOff" to Icons.Filled.GroupOff,
    "GroupRemove" to Icons.Filled.GroupRemove,
    "Groups2" to Icons.Filled.Groups2,
    "Groups3" to Icons.Filled.Groups3,
    "Groups" to Icons.Filled.Groups,
    "GroupWork" to Icons.Filled.GroupWork,
    "GTranslate" to Icons.Filled.GTranslate,
    "Hail" to Icons.Filled.Hail,
    "Handshake" to Icons.Filled.Handshake,
    "Handyman" to Icons.Filled.Handyman,
    "Hardware" to Icons.Filled.Hardware,
    "Hd" to Icons.Filled.Hd,
    "HdrAuto" to Icons.Filled.HdrAuto,
    "HdrAutoSelect" to Icons.Filled.HdrAutoSelect,
    "HdrEnhancedSelect" to Icons.Filled.HdrEnhancedSelect,
    "HdrOff" to Icons.Filled.HdrOff,
    "HdrOffSelect" to Icons.Filled.HdrOffSelect,
    "HdrOn" to Icons.Filled.HdrOn,
    "HdrOnSelect" to Icons.Filled.HdrOnSelect,
    "HdrPlus" to Icons.Filled.HdrPlus,
    "HdrStrong" to Icons.Filled.HdrStrong,
    "HdrWeak" to Icons.Filled.HdrWeak,
    "HeadphonesBattery" to Icons.Filled.HeadphonesBattery,
    "Headphones" to Icons.Filled.Headphones,
    "Headset" to Icons.Filled.Headset,
    "HeadsetMic" to Icons.Filled.HeadsetMic,
    "HeadsetOff" to Icons.Filled.HeadsetOff,
    "Healing" to Icons.Filled.Healing,
    "HealthAndSafety" to Icons.Filled.HealthAndSafety,
    "HearingDisabled" to Icons.Filled.HearingDisabled,
    "Hearing" to Icons.Filled.Hearing,
    "HeartBroken" to Icons.Filled.HeartBroken,
    "HeatPump" to Icons.Filled.HeatPump,
    "Height" to Icons.Filled.Height,
    "HelpCenter" to Icons.AutoMirrored.Filled.HelpCenter,
    "Help" to Icons.AutoMirrored.Filled.Help,
    "HelpOutline" to Icons.AutoMirrored.Filled.HelpOutline,
    "Hevc" to Icons.Filled.Hevc,
    "Hexagon" to Icons.Filled.Hexagon,
    "HideImage" to Icons.Filled.HideImage,
    "HideSource" to Icons.Filled.HideSource,
    "HighlightAlt" to Icons.Filled.HighlightAlt,
    "Highlight" to Icons.Filled.Highlight,
    "HighlightOff" to Icons.Filled.HighlightOff,
    "HighQuality" to Icons.Filled.HighQuality,
    "Hiking" to Icons.Filled.Hiking,
    "HistoryEdu" to Icons.Filled.HistoryEdu,
    "History" to Icons.Filled.History,
    "HistoryToggleOff" to Icons.Filled.HistoryToggleOff,
    "Hive" to Icons.Filled.Hive,
    "Hls" to Icons.Filled.Hls,
    "HlsOff" to Icons.Filled.HlsOff,
    "HMobiledata" to Icons.Filled.HMobiledata,
    "HolidayVillage" to Icons.Filled.HolidayVillage,
    "HomeMax" to Icons.Filled.HomeMax,
    "HomeMini" to Icons.Filled.HomeMini,
    "HomeRepairService" to Icons.Filled.HomeRepairService,
    "HomeWork" to Icons.Filled.HomeWork,
    "HorizontalDistribute" to Icons.Filled.HorizontalDistribute,
    "HorizontalRule" to Icons.Filled.HorizontalRule,
    "HorizontalSplit" to Icons.Filled.HorizontalSplit,
    "HotelClass" to Icons.Filled.HotelClass,
    "Hotel" to Icons.Filled.Hotel,
    "HotTub" to Icons.Filled.HotTub,
    "HourglassBottom" to Icons.Filled.HourglassBottom,
    "HourglassDisabled" to Icons.Filled.HourglassDisabled,
    "HourglassEmpty" to Icons.Filled.HourglassEmpty,
    "HourglassFull" to Icons.Filled.HourglassFull,
    "HourglassTop" to Icons.Filled.HourglassTop,
    "Houseboat" to Icons.Filled.Houseboat,
    "House" to Icons.Filled.House,
    "HouseSiding" to Icons.Filled.HouseSiding,
    "HowToReg" to Icons.Filled.HowToReg,
    "HowToVote" to Icons.Filled.HowToVote,
    "HPlusMobiledata" to Icons.Filled.HPlusMobiledata,
    "Html" to Icons.Filled.Html,
    "Http" to Icons.Filled.Http,
    "Https" to Icons.Filled.Https,
    "Hub" to Icons.Filled.Hub,
    "Hvac" to Icons.Filled.Hvac,
    "Icecream" to Icons.Filled.Icecream,
    "IceSkating" to Icons.Filled.IceSkating,
    "ImageAspectRatio" to Icons.Filled.ImageAspectRatio,
    "Image" to Icons.Filled.Image,
    "ImageNotSupported" to Icons.Filled.ImageNotSupported,
    "ImageSearch" to Icons.Filled.ImageSearch,
    "ImagesearchRoller" to Icons.Filled.ImagesearchRoller,
    "ImportantDevices" to Icons.Filled.ImportantDevices,
    "ImportContacts" to Icons.Filled.ImportContacts,
    "ImportExport" to Icons.Filled.ImportExport,
    "Inbox" to Icons.Filled.Inbox,
    "IncompleteCircle" to Icons.Filled.IncompleteCircle,
    "IndeterminateCheckBox" to Icons.Filled.IndeterminateCheckBox,
    "Input" to Icons.AutoMirrored.Filled.Input,
    "InsertChart" to Icons.Filled.InsertChart,
    "InsertChartOutlined" to Icons.Filled.InsertChartOutlined,
    "InsertComment" to Icons.AutoMirrored.Filled.InsertComment,
    "InsertDriveFile" to Icons.AutoMirrored.Filled.InsertDriveFile,
    "InsertEmoticon" to Icons.Filled.InsertEmoticon,
    "InsertInvitation" to Icons.Filled.InsertInvitation,
    "InsertLink" to Icons.Filled.InsertLink,
    "InsertPageBreak" to Icons.Filled.InsertPageBreak,
    "InsertPhoto" to Icons.Filled.InsertPhoto,
    "Insights" to Icons.Filled.Insights,
    "InstallDesktop" to Icons.Filled.InstallDesktop,
    "InstallMobile" to Icons.Filled.InstallMobile,
    "IntegrationInstructions" to Icons.Filled.IntegrationInstructions,
    "Interests" to Icons.Filled.Interests,
    "InterpreterMode" to Icons.Filled.InterpreterMode,
    "Inventory2" to Icons.Filled.Inventory2,
    "Inventory" to Icons.Filled.Inventory,
    "InvertColors" to Icons.Filled.InvertColors,
    "InvertColorsOff" to Icons.Filled.InvertColorsOff,
    "IosShare" to Icons.Filled.IosShare,
    "Iron" to Icons.Filled.Iron,
    "Iso" to Icons.Filled.Iso,
    "Javascript" to Icons.Filled.Javascript,
    "JoinFull" to Icons.Filled.JoinFull,
    "JoinInner" to Icons.Filled.JoinInner,
    "JoinLeft" to Icons.Filled.JoinLeft,
    "JoinRight" to Icons.Filled.JoinRight,
    "Kayaking" to Icons.Filled.Kayaking,
    "KebabDining" to Icons.Filled.KebabDining,
    "KeyboardAlt" to Icons.Filled.KeyboardAlt,
    "KeyboardBackspace" to Icons.AutoMirrored.Filled.KeyboardBackspace,
    "KeyboardCapslock" to Icons.Filled.KeyboardCapslock,
    "KeyboardCommandKey" to Icons.Filled.KeyboardCommandKey,
    "KeyboardControlKey" to Icons.Filled.KeyboardControlKey,
    "KeyboardDoubleArrowDown" to Icons.Filled.KeyboardDoubleArrowDown,
    "KeyboardDoubleArrowLeft" to Icons.Filled.KeyboardDoubleArrowLeft,
    "KeyboardDoubleArrowRight" to Icons.Filled.KeyboardDoubleArrowRight,
    "KeyboardDoubleArrowUp" to Icons.Filled.KeyboardDoubleArrowUp,
    "KeyboardHide" to Icons.Filled.KeyboardHide,
    "Keyboard" to Icons.Filled.Keyboard,
    "KeyboardOptionKey" to Icons.Filled.KeyboardOptionKey,
    "KeyboardReturn" to Icons.AutoMirrored.Filled.KeyboardReturn,
    "KeyboardTab" to Icons.AutoMirrored.Filled.KeyboardTab,
    "KeyboardVoice" to Icons.Filled.KeyboardVoice,
    "Key" to Icons.Filled.Key,
    "KeyOff" to Icons.Filled.KeyOff,
    "KingBed" to Icons.Filled.KingBed,
    "Kitchen" to Icons.Filled.Kitchen,
    "Kitesurfing" to Icons.Filled.Kitesurfing,
    "LabelImportant" to Icons.AutoMirrored.Filled.LabelImportant,
    "Label" to Icons.AutoMirrored.Filled.Label,
    "LabelOff" to Icons.AutoMirrored.Filled.LabelOff,
    "Landscape" to Icons.Filled.Landscape,
    "Landslide" to Icons.Filled.Landslide,
    "Language" to Icons.Filled.Language,
    "Lan" to Icons.Filled.Lan,
    "LaptopChromebook" to Icons.Filled.LaptopChromebook,
    "Laptop" to Icons.Filled.Laptop,
    "LaptopMac" to Icons.Filled.LaptopMac,
    "LaptopWindows" to Icons.Filled.LaptopWindows,
    "LastPage" to Icons.AutoMirrored.Filled.LastPage,
    "Launch" to Icons.AutoMirrored.Filled.Launch,
    "LayersClear" to Icons.Filled.LayersClear,
    "Layers" to Icons.Filled.Layers,
    "Leaderboard" to Icons.Filled.Leaderboard,
    "LeakAdd" to Icons.Filled.LeakAdd,
    "LeakRemove" to Icons.Filled.LeakRemove,
    "LeaveBagsAtHome" to Icons.Filled.LeaveBagsAtHome,
    "LegendToggle" to Icons.Filled.LegendToggle,
    "LensBlur" to Icons.Filled.LensBlur,
    "Lens" to Icons.Filled.Lens,
    "LibraryAddCheck" to Icons.Filled.LibraryAddCheck,
    "LibraryAdd" to Icons.Filled.LibraryAdd,
    "LibraryBooks" to Icons.AutoMirrored.Filled.LibraryBooks,
    "LibraryMusic" to Icons.Filled.LibraryMusic,
    "LightbulbCircle" to Icons.Filled.LightbulbCircle,
    "Lightbulb" to Icons.Filled.Lightbulb,
    "Light" to Icons.Filled.Light,
    "LightMode" to Icons.Filled.LightMode,
    "LinearScale" to Icons.Filled.LinearScale,
    "LineAxis" to Icons.Filled.LineAxis,
    "LineStyle" to Icons.Filled.LineStyle,
    "LineWeight" to Icons.Filled.LineWeight,
    "LinkedCamera" to Icons.Filled.LinkedCamera,
    "Link" to Icons.Filled.Link,
    "LinkOff" to Icons.Filled.LinkOff,
    "Liquor" to Icons.Filled.Liquor,
    "ListAlt" to Icons.AutoMirrored.Filled.ListAlt,
    "LiveHelp" to Icons.AutoMirrored.Filled.LiveHelp,
    "LiveTv" to Icons.Filled.LiveTv,
    "Living" to Icons.Filled.Living,
    "LocalActivity" to Icons.Filled.LocalActivity,
    "LocalAirport" to Icons.Filled.LocalAirport,
    "LocalAtm" to Icons.Filled.LocalAtm,
    "LocalBar" to Icons.Filled.LocalBar,
    "LocalCafe" to Icons.Filled.LocalCafe,
    "LocalCarWash" to Icons.Filled.LocalCarWash,
    "LocalConvenienceStore" to Icons.Filled.LocalConvenienceStore,
    "LocalDining" to Icons.Filled.LocalDining,
    "LocalDrink" to Icons.Filled.LocalDrink,
    "LocalFireDepartment" to Icons.Filled.LocalFireDepartment,
    "LocalFlorist" to Icons.Filled.LocalFlorist,
    "LocalGasStation" to Icons.Filled.LocalGasStation,
    "LocalGroceryStore" to Icons.Filled.LocalGroceryStore,
    "LocalHospital" to Icons.Filled.LocalHospital,
    "LocalHotel" to Icons.Filled.LocalHotel,
    "LocalLaundryService" to Icons.Filled.LocalLaundryService,
    "LocalLibrary" to Icons.Filled.LocalLibrary,
    "LocalMall" to Icons.Filled.LocalMall,
    "LocalMovies" to Icons.Filled.LocalMovies,
    "LocalOffer" to Icons.Filled.LocalOffer,
    "LocalParking" to Icons.Filled.LocalParking,
    "LocalPharmacy" to Icons.Filled.LocalPharmacy,
    "LocalPhone" to Icons.Filled.LocalPhone,
    "LocalPizza" to Icons.Filled.LocalPizza,
    "LocalPlay" to Icons.Filled.LocalPlay,
    "LocalPolice" to Icons.Filled.LocalPolice,
    "LocalPostOffice" to Icons.Filled.LocalPostOffice,
    "LocalPrintshop" to Icons.Filled.LocalPrintshop,
    "LocalSee" to Icons.Filled.LocalSee,
    "LocalShipping" to Icons.Filled.LocalShipping,
    "LocalTaxi" to Icons.Filled.LocalTaxi,
    "LocationCity" to Icons.Filled.LocationCity,
    "LocationDisabled" to Icons.Filled.LocationDisabled,
    "LocationOff" to Icons.Filled.LocationOff,
    "LocationSearching" to Icons.Filled.LocationSearching,
    "LockClock" to Icons.Filled.LockClock,
    "LockOpen" to Icons.Filled.LockOpen,
    "LockPerson" to Icons.Filled.LockPerson,
    "LockReset" to Icons.Filled.LockReset,
    "Login" to Icons.AutoMirrored.Filled.Login,
    "LogoDev" to Icons.Filled.LogoDev,
    "Logout" to Icons.AutoMirrored.Filled.Logout,
    "Looks3" to Icons.Filled.Looks3,
    "Looks4" to Icons.Filled.Looks4,
    "Looks5" to Icons.Filled.Looks5,
    "Looks6" to Icons.Filled.Looks6,
    "Looks" to Icons.Filled.Looks,
    "LooksOne" to Icons.Filled.LooksOne,
    "LooksTwo" to Icons.Filled.LooksTwo,
    "Loop" to Icons.Filled.Loop,
    "Loupe" to Icons.Filled.Loupe,
    "LowPriority" to Icons.Filled.LowPriority,
    "Loyalty" to Icons.Filled.Loyalty,
    "LteMobiledata" to Icons.Filled.LteMobiledata,
    "LtePlusMobiledata" to Icons.Filled.LtePlusMobiledata,
    "Luggage" to Icons.Filled.Luggage,
    "LunchDining" to Icons.Filled.LunchDining,
    "Lyrics" to Icons.Filled.Lyrics,
    "MacroOff" to Icons.Filled.MacroOff,
    "Mail" to Icons.Filled.Mail,
    "MailLock" to Icons.Filled.MailLock,
    "Male" to Icons.Filled.Male,
    "Man2" to Icons.Filled.Man2,
    "Man3" to Icons.Filled.Man3,
    "Man4" to Icons.Filled.Man4,
    "ManageAccounts" to Icons.Filled.ManageAccounts,
    "ManageHistory" to Icons.Filled.ManageHistory,
    "ManageSearch" to Icons.AutoMirrored.Filled.ManageSearch,
    "Man" to Icons.Filled.Man,
    "Map" to Icons.Filled.Map,
    "MapsHomeWork" to Icons.Filled.MapsHomeWork,
    "MapsUgc" to Icons.Filled.MapsUgc,
    "Margin" to Icons.Filled.Margin,
    "MarkAsUnread" to Icons.Filled.MarkAsUnread,
    "MarkChatRead" to Icons.Filled.MarkChatRead,
    "MarkChatUnread" to Icons.Filled.MarkChatUnread,
    "MarkEmailRead" to Icons.Filled.MarkEmailRead,
    "MarkEmailUnread" to Icons.Filled.MarkEmailUnread,
    "MarkUnreadChatAlt" to Icons.Filled.MarkUnreadChatAlt,
    "Markunread" to Icons.Filled.Markunread,
    "MarkunreadMailbox" to Icons.Filled.MarkunreadMailbox,
    "Masks" to Icons.Filled.Masks,
    "Maximize" to Icons.Filled.Maximize,
    "MediaBluetoothOff" to Icons.Filled.MediaBluetoothOff,
    "MediaBluetoothOn" to Icons.Filled.MediaBluetoothOn,
    "Mediation" to Icons.Filled.Mediation,
    "MedicalInformation" to Icons.Filled.MedicalInformation,
    "MedicalServices" to Icons.Filled.MedicalServices,
    "Medication" to Icons.Filled.Medication,
    "MeetingRoom" to Icons.Filled.MeetingRoom,
    "Memory" to Icons.Filled.Memory,
    "MenuBook" to Icons.AutoMirrored.Filled.MenuBook,
    "MenuOpen" to Icons.AutoMirrored.Filled.MenuOpen,
    "Merge" to Icons.Filled.Merge,
    "MergeType" to Icons.AutoMirrored.Filled.MergeType,
    "Message" to Icons.AutoMirrored.Filled.Message,
    "MicExternalOff" to Icons.Filled.MicExternalOff,
    "MicExternalOn" to Icons.Filled.MicExternalOn,
    "Mic" to Icons.Filled.Mic,
    "MicNone" to Icons.Filled.MicNone,
    "MicOff" to Icons.Filled.MicOff,
    "Microwave" to Icons.Filled.Microwave,
    "MilitaryTech" to Icons.Filled.MilitaryTech,
    "Minimize" to Icons.Filled.Minimize,
    "MinorCrash" to Icons.Filled.MinorCrash,
    "MiscellaneousServices" to Icons.Filled.MiscellaneousServices,
    "MissedVideoCall" to Icons.AutoMirrored.Filled.MissedVideoCall,
    "Mms" to Icons.Filled.Mms,
    "MobiledataOff" to Icons.Filled.MobiledataOff,
    "MobileFriendly" to Icons.Filled.MobileFriendly,
    "MobileOff" to Icons.Filled.MobileOff,
    "MobileScreenShare" to Icons.AutoMirrored.Filled.MobileScreenShare,
    "ModeComment" to Icons.Filled.ModeComment,
    "ModeEdit" to Icons.Filled.ModeEdit,
    "ModeEditOutline" to Icons.Filled.ModeEditOutline,
    "ModeFanOff" to Icons.Filled.ModeFanOff,
    "Mode" to Icons.Filled.Mode,
    "ModelTraining" to Icons.Filled.ModelTraining,
    "ModeNight" to Icons.Filled.ModeNight,
    "ModeOfTravel" to Icons.Filled.ModeOfTravel,
    "ModeStandby" to Icons.Filled.ModeStandby,
    "MonetizationOn" to Icons.Filled.MonetizationOn,
    "Money" to Icons.Filled.Money,
    "MoneyOffCsred" to Icons.Filled.MoneyOffCsred,
    "MoneyOff" to Icons.Filled.MoneyOff,
    "MonitorHeart" to Icons.Filled.MonitorHeart,
    "Monitor" to Icons.Filled.Monitor,
    "MonitorWeight" to Icons.Filled.MonitorWeight,
    "MonochromePhotos" to Icons.Filled.MonochromePhotos,
    "MoodBad" to Icons.Filled.MoodBad,
    "Mood" to Icons.Filled.Mood,
    "Moped" to Icons.Filled.Moped,
    "MoreHoriz" to Icons.Filled.MoreHoriz,
    "More" to Icons.AutoMirrored.Filled.More,
    "MoreTime" to Icons.Filled.MoreTime,
    "Mosque" to Icons.Filled.Mosque,
    "MotionPhotosAuto" to Icons.Filled.MotionPhotosAuto,
    "MotionPhotosOff" to Icons.Filled.MotionPhotosOff,
    "MotionPhotosOn" to Icons.Filled.MotionPhotosOn,
    "MotionPhotosPaused" to Icons.Filled.MotionPhotosPaused,
    "MotionPhotosPause" to Icons.Filled.MotionPhotosPause,
    "Motorcycle" to Icons.Filled.Motorcycle,
    "Mouse" to Icons.Filled.Mouse,
    "MoveDown" to Icons.Filled.MoveDown,
    "MoveToInbox" to Icons.Filled.MoveToInbox,
    "MoveUp" to Icons.Filled.MoveUp,
    "MovieCreation" to Icons.Filled.MovieCreation,
    "MovieFilter" to Icons.Filled.MovieFilter,
    "Movie" to Icons.Filled.Movie,
    "Moving" to Icons.Filled.Moving,
    "Mp" to Icons.Filled.Mp,
    "MultilineChart" to Icons.AutoMirrored.Filled.MultilineChart,
    "MultipleStop" to Icons.Filled.MultipleStop,
    "Museum" to Icons.Filled.Museum,
    "MusicNote" to Icons.Filled.MusicNote,
    "MusicOff" to Icons.Filled.MusicOff,
    "MusicVideo" to Icons.Filled.MusicVideo,
    "MyLocation" to Icons.Filled.MyLocation,
    "Nat" to Icons.Filled.Nat,
    "Nature" to Icons.Filled.Nature,
    "NaturePeople" to Icons.Filled.NaturePeople,
    "NavigateBefore" to Icons.AutoMirrored.Filled.NavigateBefore,
    "NavigateNext" to Icons.AutoMirrored.Filled.NavigateNext,
    "Navigation" to Icons.Filled.Navigation,
    "NearbyError" to Icons.Filled.NearbyError,
    "NearbyOff" to Icons.Filled.NearbyOff,
    "NearMeDisabled" to Icons.Filled.NearMeDisabled,
    "NearMe" to Icons.Filled.NearMe,
    "NestCamWiredStand" to Icons.Filled.NestCamWiredStand,
    "NetworkCell" to Icons.Filled.NetworkCell,
    "NetworkCheck" to Icons.Filled.NetworkCheck,
    "NetworkLocked" to Icons.Filled.NetworkLocked,
    "NetworkPing" to Icons.Filled.NetworkPing,
    "NetworkWifi1Bar" to Icons.Filled.NetworkWifi1Bar,
    "NetworkWifi2Bar" to Icons.Filled.NetworkWifi2Bar,
    "NetworkWifi3Bar" to Icons.Filled.NetworkWifi3Bar,
    "NetworkWifi" to Icons.Filled.NetworkWifi,
    "NewLabel" to Icons.Filled.NewLabel,
    "NewReleases" to Icons.Filled.NewReleases,
    "Newspaper" to Icons.Filled.Newspaper,
    "NextPlan" to Icons.AutoMirrored.Filled.NextPlan,
    "NextWeek" to Icons.AutoMirrored.Filled.NextWeek,
    "Nfc" to Icons.Filled.Nfc,
    "Nightlife" to Icons.Filled.Nightlife,
    "Nightlight" to Icons.Filled.Nightlight,
    "NightlightRound" to Icons.Filled.NightlightRound,
    "NightShelter" to Icons.Filled.NightShelter,
    "NightsStay" to Icons.Filled.NightsStay,
    "NoAccounts" to Icons.Filled.NoAccounts,
    "NoAdultContent" to Icons.Filled.NoAdultContent,
    "NoBackpack" to Icons.Filled.NoBackpack,
    "NoCell" to Icons.Filled.NoCell,
    "NoCrash" to Icons.Filled.NoCrash,
    "NoDrinks" to Icons.Filled.NoDrinks,
    "NoEncryptionGmailerrorred" to Icons.Filled.NoEncryptionGmailerrorred,
    "NoEncryption" to Icons.Filled.NoEncryption,
    "NoFlash" to Icons.Filled.NoFlash,
    "NoFood" to Icons.Filled.NoFood,
    "NoiseAware" to Icons.Filled.NoiseAware,
    "NoiseControlOff" to Icons.Filled.NoiseControlOff,
    "NoLuggage" to Icons.Filled.NoLuggage,
    "NoMeals" to Icons.Filled.NoMeals,
    "NoMeetingRoom" to Icons.Filled.NoMeetingRoom,
    "NoPhotography" to Icons.Filled.NoPhotography,
    "NordicWalking" to Icons.Filled.NordicWalking,
    "NorthEast" to Icons.Filled.NorthEast,
    "North" to Icons.Filled.North,
    "NorthWest" to Icons.Filled.NorthWest,
    "NoSim" to Icons.Filled.NoSim,
    "NoStroller" to Icons.Filled.NoStroller,
    "NotAccessible" to Icons.Filled.NotAccessible,
    "NoteAdd" to Icons.AutoMirrored.Filled.NoteAdd,
    "NoteAlt" to Icons.Filled.NoteAlt,
    "Note" to Icons.AutoMirrored.Filled.Note,
    "Notes" to Icons.AutoMirrored.Filled.Notes,
    "NotificationAdd" to Icons.Filled.NotificationAdd,
    "NotificationImportant" to Icons.Filled.NotificationImportant,
    "NotificationsActive" to Icons.Filled.NotificationsActive,
    "NotificationsNone" to Icons.Filled.NotificationsNone,
    "NotificationsOff" to Icons.Filled.NotificationsOff,
    "NotificationsPaused" to Icons.Filled.NotificationsPaused,
    "NotInterested" to Icons.Filled.NotInterested,
    "NotListedLocation" to Icons.AutoMirrored.Filled.NotListedLocation,
    "NoTransfer" to Icons.Filled.NoTransfer,
    "NotStarted" to Icons.Filled.NotStarted,
    "Numbers" to Icons.Filled.Numbers,
    "OfflineBolt" to Icons.Filled.OfflineBolt,
    "OfflinePin" to Icons.Filled.OfflinePin,
    "OfflineShare" to Icons.AutoMirrored.Filled.OfflineShare,
    "OilBarrel" to Icons.Filled.OilBarrel,
    "OndemandVideo" to Icons.Filled.OndemandVideo,
    "OnDeviceTraining" to Icons.Filled.OnDeviceTraining,
    "OnlinePrediction" to Icons.Filled.OnlinePrediction,
    "Opacity" to Icons.Filled.Opacity,
    "OpenInBrowser" to Icons.Filled.OpenInBrowser,
    "OpenInFull" to Icons.Filled.OpenInFull,
    "OpenInNew" to Icons.AutoMirrored.Filled.OpenInNew,
    "OpenInNewOff" to Icons.Filled.OpenInNewOff,
    "OpenWith" to Icons.Filled.OpenWith,
    "OtherHouses" to Icons.Filled.OtherHouses,
    "Outbond" to Icons.Filled.Outbond,
    "Outbound" to Icons.AutoMirrored.Filled.Outbound,
    "Outbox" to Icons.Filled.Outbox,
    "OutdoorGrill" to Icons.Filled.OutdoorGrill,
    "Outlet" to Icons.Filled.Outlet,
    "OutlinedFlag" to Icons.Filled.OutlinedFlag,
    "Output" to Icons.Filled.Output,
    "Padding" to Icons.Filled.Padding,
    "Pages" to Icons.Filled.Pages,
    "Pageview" to Icons.Filled.Pageview,
    "Paid" to Icons.Filled.Paid,
    "Palette" to Icons.Filled.Palette,
    "PanoramaFishEye" to Icons.Filled.PanoramaFishEye,
    "PanoramaHorizontal" to Icons.Filled.PanoramaHorizontal,
    "PanoramaHorizontalSelect" to Icons.Filled.PanoramaHorizontalSelect,
    "Panorama" to Icons.Filled.Panorama,
    "PanoramaPhotosphere" to Icons.Filled.PanoramaPhotosphere,
    "PanoramaPhotosphereSelect" to Icons.Filled.PanoramaPhotosphereSelect,
    "PanoramaVertical" to Icons.Filled.PanoramaVertical,
    "PanoramaVerticalSelect" to Icons.Filled.PanoramaVerticalSelect,
    "PanoramaWideAngle" to Icons.Filled.PanoramaWideAngle,
    "PanoramaWideAngleSelect" to Icons.Filled.PanoramaWideAngleSelect,
    "PanToolAlt" to Icons.Filled.PanToolAlt,
    "PanTool" to Icons.Filled.PanTool,
    "Paragliding" to Icons.Filled.Paragliding,
    "Park" to Icons.Filled.Park,
    "PartyMode" to Icons.Filled.PartyMode,
    "Password" to Icons.Filled.Password,
    "Pattern" to Icons.Filled.Pattern,
    "PauseCircleFilled" to Icons.Filled.PauseCircleFilled,
    "PauseCircle" to Icons.Filled.PauseCircle,
    "PauseCircleOutline" to Icons.Filled.PauseCircleOutline,
    "Pause" to Icons.Filled.Pause,
    "PausePresentation" to Icons.Filled.PausePresentation,
    "Payment" to Icons.Filled.Payment,
    "Payments" to Icons.Filled.Payments,
    "PedalBike" to Icons.Filled.PedalBike,
    "PendingActions" to Icons.Filled.PendingActions,
    "Pending" to Icons.Filled.Pending,
    "Pentagon" to Icons.Filled.Pentagon,
    "PeopleAlt" to Icons.Filled.PeopleAlt,
    "People" to Icons.Filled.People,
    "PeopleOutline" to Icons.Filled.PeopleOutline,
    "Percent" to Icons.Filled.Percent,
    "PermCameraMic" to Icons.Filled.PermCameraMic,
    "PermContactCalendar" to Icons.Filled.PermContactCalendar,
    "PermDataSetting" to Icons.Filled.PermDataSetting,
    "PermDeviceInformation" to Icons.Filled.PermDeviceInformation,
    "PermIdentity" to Icons.Filled.PermIdentity,
    "PermMedia" to Icons.Filled.PermMedia,
    "PermPhoneMsg" to Icons.Filled.PermPhoneMsg,
    "PermScanWifi" to Icons.Filled.PermScanWifi,
    "Person" to Icons.Filled.Person2,
    "Person2" to Icons.Filled.Person2,
    "Person3" to Icons.Filled.Person3,
    "Person4" to Icons.Filled.Person4,
    "PersonAddAlt1" to Icons.Filled.PersonAddAlt1,
    "PersonAddAlt" to Icons.Filled.PersonAddAlt,
    "PersonAddDisabled" to Icons.Filled.PersonAddDisabled,
    "PersonAdd" to Icons.Filled.PersonAdd,
    "PersonalInjury" to Icons.Filled.PersonalInjury,
    "PersonalVideo" to Icons.Filled.PersonalVideo,
    "PersonOff" to Icons.Filled.PersonOff,
    "PersonOutline" to Icons.Filled.PersonOutline,
    "PersonPinCircle" to Icons.Filled.PersonPinCircle,
    "PersonPin" to Icons.Filled.PersonPin,
    "PersonRemoveAlt1" to Icons.Filled.PersonRemoveAlt1,
    "PersonRemove" to Icons.Filled.PersonRemove,
    "PersonSearch" to Icons.Filled.PersonSearch,
    "PestControl" to Icons.Filled.PestControl,
    "PestControlRodent" to Icons.Filled.PestControlRodent,
    "Pets" to Icons.Filled.Pets,
    "Phishing" to Icons.Filled.Phishing,
    "PhoneAndroid" to Icons.Filled.PhoneAndroid,
    "PhoneBluetoothSpeaker" to Icons.Filled.PhoneBluetoothSpeaker,
    "PhoneCallback" to Icons.AutoMirrored.Filled.PhoneCallback,
    "PhoneDisabled" to Icons.Filled.PhoneDisabled,
    "PhoneEnabled" to Icons.Filled.PhoneEnabled,
    "PhoneForwarded" to Icons.AutoMirrored.Filled.PhoneForwarded,
    "PhoneInTalk" to Icons.Filled.PhoneInTalk,
    "PhoneIphone" to Icons.Filled.PhoneIphone,
    "PhonelinkErase" to Icons.Filled.PhonelinkErase,
    "Phonelink" to Icons.Filled.Phonelink,
    "PhonelinkLock" to Icons.Filled.PhonelinkLock,
    "PhonelinkOff" to Icons.Filled.PhonelinkOff,
    "PhonelinkRing" to Icons.Filled.PhonelinkRing,
    "PhonelinkSetup" to Icons.Filled.PhonelinkSetup,
    "PhoneLocked" to Icons.Filled.PhoneLocked,
    "PhoneMissed" to Icons.AutoMirrored.Filled.PhoneMissed,
    "PhonePaused" to Icons.Filled.PhonePaused,
    "PhotoAlbum" to Icons.Filled.PhotoAlbum,
    "PhotoCameraBack" to Icons.Filled.PhotoCameraBack,
    "PhotoCameraFront" to Icons.Filled.PhotoCameraFront,
    "PhotoCamera" to Icons.Filled.PhotoCamera,
    "PhotoFilter" to Icons.Filled.PhotoFilter,
    "Photo" to Icons.Filled.Photo,
    "PhotoLibrary" to Icons.Filled.PhotoLibrary,
    "PhotoSizeSelectActual" to Icons.Filled.PhotoSizeSelectActual,
    "PhotoSizeSelectLarge" to Icons.Filled.PhotoSizeSelectLarge,
    "PhotoSizeSelectSmall" to Icons.Filled.PhotoSizeSelectSmall,
    "Php" to Icons.Filled.Php,
    "Piano" to Icons.Filled.Piano,
    "PianoOff" to Icons.Filled.PianoOff,
    "PictureAsPdf" to Icons.Filled.PictureAsPdf,
    "PictureInPictureAlt" to Icons.Filled.PictureInPictureAlt,
    "PictureInPicture" to Icons.Filled.PictureInPicture,
    "PieChart" to Icons.Filled.PieChart,
    "PieChartOutline" to Icons.Filled.PieChartOutline,
    "Pinch" to Icons.Filled.Pinch,
    "PinDrop" to Icons.Filled.PinDrop,
    "PinEnd" to Icons.Filled.PinEnd,
    "PinInvoke" to Icons.Filled.PinInvoke,
    "Pin" to Icons.Filled.Pin,
    "PivotTableChart" to Icons.Filled.PivotTableChart,
    "Pix" to Icons.Filled.Pix,
    "Plagiarism" to Icons.Filled.Plagiarism,
    "PlayCircleFilled" to Icons.Filled.PlayCircleFilled,
    "PlayCircle" to Icons.Filled.PlayCircle,
    "PlayCircleOutline" to Icons.Filled.PlayCircleOutline,
    "PlayDisabled" to Icons.Filled.PlayDisabled,
    "PlayForWork" to Icons.Filled.PlayForWork,
    "PlayLesson" to Icons.Filled.PlayLesson,
    "PlaylistAddCheckCircle" to Icons.Filled.PlaylistAddCheckCircle,
    "PlaylistAddCheck" to Icons.AutoMirrored.Filled.PlaylistAddCheck,
    "PlaylistAddCircle" to Icons.Filled.PlaylistAddCircle,
    "PlaylistAdd" to Icons.AutoMirrored.Filled.PlaylistAdd,
    "PlaylistPlay" to Icons.AutoMirrored.Filled.PlaylistPlay,
    "PlaylistRemove" to Icons.Filled.PlaylistRemove,
    "Plumbing" to Icons.Filled.Plumbing,
    "PlusOne" to Icons.Filled.PlusOne,
    "Podcasts" to Icons.Filled.Podcasts,
    "PointOfSale" to Icons.Filled.PointOfSale,
    "Policy" to Icons.Filled.Policy,
    "Poll" to Icons.Filled.Poll,
    "Polyline" to Icons.Filled.Polyline,
    "Polymer" to Icons.Filled.Polymer,
    "Pool" to Icons.Filled.Pool,
    "PortableWifiOff" to Icons.Filled.PortableWifiOff,
    "Portrait" to Icons.Filled.Portrait,
    "PostAdd" to Icons.Filled.PostAdd,
    "PowerInput" to Icons.Filled.PowerInput,
    "Power" to Icons.Filled.Power,
    "PowerOff" to Icons.Filled.PowerOff,
    "PowerSettingsNew" to Icons.Filled.PowerSettingsNew,
    "PrecisionManufacturing" to Icons.Filled.PrecisionManufacturing,
    "PregnantWoman" to Icons.Filled.PregnantWoman,
    "PresentToAll" to Icons.Filled.PresentToAll,
    "Preview" to Icons.Filled.Preview,
    "PriceChange" to Icons.Filled.PriceChange,
    "PriceCheck" to Icons.Filled.PriceCheck,
    "PrintDisabled" to Icons.Filled.PrintDisabled,
    "Print" to Icons.Filled.Print,
    "PriorityHigh" to Icons.Filled.PriorityHigh,
    "PrivacyTip" to Icons.Filled.PrivacyTip,
    "PrivateConnectivity" to Icons.Filled.PrivateConnectivity,
    "ProductionQuantityLimits" to Icons.Filled.ProductionQuantityLimits,
    "Propane" to Icons.Filled.Propane,
    "PropaneTank" to Icons.Filled.PropaneTank,
    "PsychologyAlt" to Icons.Filled.PsychologyAlt,
    "Psychology" to Icons.Filled.Psychology,
    "Public" to Icons.Filled.Public,
    "PublicOff" to Icons.Filled.PublicOff,
    "PublishedWithChanges" to Icons.Filled.PublishedWithChanges,
    "Publish" to Icons.Filled.Publish,
    "PunchClock" to Icons.Filled.PunchClock,
    "PushPin" to Icons.Filled.PushPin,
    "QrCode2" to Icons.Filled.QrCode2,
    "QrCode" to Icons.Filled.QrCode,
    "QrCodeScanner" to Icons.Filled.QrCodeScanner,
    "QueryBuilder" to Icons.Filled.QueryBuilder,
    "QueryStats" to Icons.Filled.QueryStats,
    "QuestionAnswer" to Icons.Filled.QuestionAnswer,
    "QuestionMark" to Icons.Filled.QuestionMark,
    "Queue" to Icons.Filled.Queue,
    "QueueMusic" to Icons.AutoMirrored.Filled.QueueMusic,
    "QueuePlayNext" to Icons.Filled.QueuePlayNext,
    "Quickreply" to Icons.Filled.Quickreply,
    "Quiz" to Icons.Filled.Quiz,
    "Radar" to Icons.Filled.Radar,
    "RadioButtonChecked" to Icons.Filled.RadioButtonChecked,
    "RadioButtonUnchecked" to Icons.Filled.RadioButtonUnchecked,
    "Radio" to Icons.Filled.Radio,
    "RailwayAlert" to Icons.Filled.RailwayAlert,
    "RamenDining" to Icons.Filled.RamenDining,
    "RampLeft" to Icons.Filled.RampLeft,
    "RampRight" to Icons.Filled.RampRight,
    "RateReview" to Icons.Filled.RateReview,
    "RawOff" to Icons.Filled.RawOff,
    "RawOn" to Icons.Filled.RawOn,
    "ReadMore" to Icons.AutoMirrored.Filled.ReadMore,
    "RealEstateAgent" to Icons.Filled.RealEstateAgent,
    "Receipt" to Icons.Filled.Receipt,
    "ReceiptLong" to Icons.AutoMirrored.Filled.ReceiptLong,
    "RecentActors" to Icons.Filled.RecentActors,
    "Recommend" to Icons.Filled.Recommend,
    "RecordVoiceOver" to Icons.Filled.RecordVoiceOver,
    "Rectangle" to Icons.Filled.Rectangle,
    "Recycling" to Icons.Filled.Recycling,
    "Redeem" to Icons.Filled.Redeem,
    "Redo" to Icons.AutoMirrored.Filled.Redo,
    "ReduceCapacity" to Icons.Filled.ReduceCapacity,
    "RememberMe" to Icons.Filled.RememberMe,
    "RemoveCircle" to Icons.Filled.RemoveCircle,
    "RemoveCircleOutline" to Icons.Filled.RemoveCircleOutline,
    "RemoveDone" to Icons.Filled.RemoveDone,
    "RemoveFromQueue" to Icons.Filled.RemoveFromQueue,
    "Remove" to Icons.Filled.Remove,
    "RemoveModerator" to Icons.Filled.RemoveModerator,
    "RemoveRedEye" to Icons.Filled.RemoveRedEye,
    "RemoveRoad" to Icons.Filled.RemoveRoad,
    "RemoveShoppingCart" to Icons.Filled.RemoveShoppingCart,
    "Reorder" to Icons.Filled.Reorder,
    "Repartition" to Icons.Filled.Repartition,
    "Repeat" to Icons.Filled.Repeat,
    "RepeatOne" to Icons.Filled.RepeatOne,
    "RepeatOneOn" to Icons.Filled.RepeatOneOn,
    "RepeatOn" to Icons.Filled.RepeatOn,
    "Replay5" to Icons.Filled.Replay5,
    "Replay10" to Icons.Filled.Replay10,
    "Replay30" to Icons.Filled.Replay30,
    "ReplayCircleFilled" to Icons.Filled.ReplayCircleFilled,
    "Replay" to Icons.Filled.Replay,
    "ReplyAll" to Icons.AutoMirrored.Filled.ReplyAll,
    "Reply" to Icons.AutoMirrored.Filled.Reply,
    "ReportGmailerrorred" to Icons.Filled.ReportGmailerrorred,
    "Report" to Icons.Filled.Report,
    "ReportOff" to Icons.Filled.ReportOff,
    "ReportProblem" to Icons.Filled.ReportProblem,
    "RequestPage" to Icons.Filled.RequestPage,
    "RequestQuote" to Icons.Filled.RequestQuote,
    "ResetTv" to Icons.Filled.ResetTv,
    "RestartAlt" to Icons.Filled.RestartAlt,
    "Restaurant" to Icons.Filled.Restaurant,
    "RestaurantMenu" to Icons.Filled.RestaurantMenu,
    "RestoreFromTrash" to Icons.Filled.RestoreFromTrash,
    "Restore" to Icons.Filled.Restore,
    "RestorePage" to Icons.Filled.RestorePage,
    "Reviews" to Icons.Filled.Reviews,
    "RiceBowl" to Icons.Filled.RiceBowl,
    "RingVolume" to Icons.Filled.RingVolume,
    "RMobiledata" to Icons.Filled.RMobiledata,
    "Rocket" to Icons.Filled.Rocket,
    "RocketLaunch" to Icons.Filled.RocketLaunch,
    "RollerShadesClosed" to Icons.Filled.RollerShadesClosed,
    "RollerShades" to Icons.Filled.RollerShades,
    "RollerSkating" to Icons.Filled.RollerSkating,
    "Roofing" to Icons.Filled.Roofing,
    "Room" to Icons.Filled.Room,
    "RoomPreferences" to Icons.Filled.RoomPreferences,
    "RoomService" to Icons.Filled.RoomService,
    "Rotate90DegreesCcw" to Icons.Filled.Rotate90DegreesCcw,
    "Rotate90DegreesCw" to Icons.Filled.Rotate90DegreesCw,
    "RotateLeft" to Icons.AutoMirrored.Filled.RotateLeft,
    "RotateRight" to Icons.AutoMirrored.Filled.RotateRight,
    "RoundaboutLeft" to Icons.Filled.RoundaboutLeft,
    "RoundaboutRight" to Icons.Filled.RoundaboutRight,
    "RoundedCorner" to Icons.Filled.RoundedCorner,
    "Route" to Icons.Filled.Route,
    "Router" to Icons.Filled.Router,
    "Rowing" to Icons.Filled.Rowing,
    "RssFeed" to Icons.Filled.RssFeed,
    "Rsvp" to Icons.Filled.Rsvp,
    "Rtt" to Icons.AutoMirrored.Filled.Rtt,
    "RuleFolder" to Icons.Filled.RuleFolder,
    "Rule" to Icons.AutoMirrored.Filled.Rule,
    "RunCircle" to Icons.Filled.RunCircle,
    "RunningWithErrors" to Icons.Filled.RunningWithErrors,
    "RvHookup" to Icons.Filled.RvHookup,
    "SafetyCheck" to Icons.Filled.SafetyCheck,
    "SafetyDivider" to Icons.Filled.SafetyDivider,
    "Sailing" to Icons.Filled.Sailing,
    "Sanitizer" to Icons.Filled.Sanitizer,
    "SatelliteAlt" to Icons.Filled.SatelliteAlt,
    "Satellite" to Icons.Filled.Satellite,
    "SaveAlt" to Icons.Filled.SaveAlt,
    "SaveAs" to Icons.Filled.SaveAs,
    "SavedSearch" to Icons.Filled.SavedSearch,
    "Save" to Icons.Filled.Save,
    "Savings" to Icons.Filled.Savings,
    "Scale" to Icons.Filled.Scale,
    "Scanner" to Icons.Filled.Scanner,
    "ScatterPlot" to Icons.Filled.ScatterPlot,
    "Schedule" to Icons.Filled.Schedule,
    "ScheduleSend" to Icons.AutoMirrored.Filled.ScheduleSend,
    "Schema" to Icons.Filled.Schema,
    "School" to Icons.Filled.School,
    "Science" to Icons.Filled.Science,
    "Scoreboard" to Icons.Filled.Scoreboard,
    "Score" to Icons.Filled.Score,
    "ScreenLockLandscape" to Icons.Filled.ScreenLockLandscape,
    "ScreenLockPortrait" to Icons.Filled.ScreenLockPortrait,
    "ScreenLockRotation" to Icons.Filled.ScreenLockRotation,
    "ScreenRotationAlt" to Icons.Filled.ScreenRotationAlt,
    "ScreenRotation" to Icons.Filled.ScreenRotation,
    "ScreenSearchDesktop" to Icons.Filled.ScreenSearchDesktop,
    "ScreenShare" to Icons.AutoMirrored.Filled.ScreenShare,
    "Screenshot" to Icons.Filled.Screenshot,
    "ScreenshotMonitor" to Icons.Filled.ScreenshotMonitor,
    "ScubaDiving" to Icons.Filled.ScubaDiving,
    "SdCardAlert" to Icons.Filled.SdCardAlert,
    "SdCard" to Icons.Filled.SdCard,
    "Sd" to Icons.Filled.Sd,
    "SdStorage" to Icons.Filled.SdStorage,
    "SearchOff" to Icons.Filled.SearchOff,
    "Security" to Icons.Filled.Security,
    "SecurityUpdateGood" to Icons.Filled.SecurityUpdateGood,
    "SecurityUpdate" to Icons.Filled.SecurityUpdate,
    "SecurityUpdateWarning" to Icons.Filled.SecurityUpdateWarning,
    "Segment" to Icons.AutoMirrored.Filled.Segment,
    "SelectAll" to Icons.Filled.SelectAll,
    "SelfImprovement" to Icons.Filled.SelfImprovement,
    "Sell" to Icons.Filled.Sell,
    "SendAndArchive" to Icons.AutoMirrored.Filled.SendAndArchive,
    "SendTimeExtension" to Icons.Filled.SendTimeExtension,
    "SendToMobile" to Icons.AutoMirrored.Filled.SendToMobile,
    "SensorDoor" to Icons.Filled.SensorDoor,
    "SensorOccupied" to Icons.Filled.SensorOccupied,
    "Sensors" to Icons.Filled.Sensors,
    "SensorsOff" to Icons.Filled.SensorsOff,
    "SensorWindow" to Icons.Filled.SensorWindow,
    "SentimentDissatisfied" to Icons.Filled.SentimentDissatisfied,
    "SentimentNeutral" to Icons.Filled.SentimentNeutral,
    "SentimentSatisfiedAlt" to Icons.Filled.SentimentSatisfiedAlt,
    "SentimentSatisfied" to Icons.Filled.SentimentSatisfied,
    "SentimentVeryDissatisfied" to Icons.Filled.SentimentVeryDissatisfied,
    "SentimentVerySatisfied" to Icons.Filled.SentimentVerySatisfied,
    "SetMeal" to Icons.Filled.SetMeal,
    "SettingsAccessibility" to Icons.Filled.SettingsAccessibility,
    "SettingsApplications" to Icons.Filled.SettingsApplications,
    "SettingsBackupRestore" to Icons.Filled.SettingsBackupRestore,
    "SettingsBluetooth" to Icons.Filled.SettingsBluetooth,
    "SettingsBrightness" to Icons.Filled.SettingsBrightness,
    "SettingsCell" to Icons.Filled.SettingsCell,
    "SettingsEthernet" to Icons.Filled.SettingsEthernet,
    "SettingsInputAntenna" to Icons.Filled.SettingsInputAntenna,
    "SettingsInputComponent" to Icons.Filled.SettingsInputComponent,
    "SettingsInputComposite" to Icons.Filled.SettingsInputComposite,
    "SettingsInputHdmi" to Icons.Filled.SettingsInputHdmi,
    "SettingsInputSvideo" to Icons.Filled.SettingsInputSvideo,
    "SettingsOverscan" to Icons.Filled.SettingsOverscan,
    "SettingsPhone" to Icons.Filled.SettingsPhone,
    "SettingsPower" to Icons.Filled.SettingsPower,
    "SettingsRemote" to Icons.Filled.SettingsRemote,
    "SettingsSuggest" to Icons.Filled.SettingsSuggest,
    "SettingsSystemDaydream" to Icons.Filled.SettingsSystemDaydream,
    "SettingsVoice" to Icons.Filled.SettingsVoice,
    "SevereCold" to Icons.Filled.SevereCold,
    "ShapeLine" to Icons.Filled.ShapeLine,
    "ShareLocation" to Icons.Filled.ShareLocation,
    "Shield" to Icons.Filled.Shield,
    "ShieldMoon" to Icons.Filled.ShieldMoon,
    "Shop2" to Icons.Filled.Shop2,
    "Shop" to Icons.Filled.Shop,
    "ShoppingBag" to Icons.Filled.ShoppingBag,
    "ShoppingBasket" to Icons.Filled.ShoppingBasket,
    "ShoppingCartCheckout" to Icons.Filled.ShoppingCartCheckout,
    "ShopTwo" to Icons.Filled.ShopTwo,
    "Shortcut" to Icons.AutoMirrored.Filled.Shortcut,
    "ShortText" to Icons.AutoMirrored.Filled.ShortText,
    "ShowChart" to Icons.AutoMirrored.Filled.ShowChart,
    "Shower" to Icons.Filled.Shower,
    "Shuffle" to Icons.Filled.Shuffle,
    "ShuffleOn" to Icons.Filled.ShuffleOn,
    "ShutterSpeed" to Icons.Filled.ShutterSpeed,
    "Sick" to Icons.Filled.Sick,
    "SignalCellular0Bar" to Icons.Filled.SignalCellular0Bar,
    "SignalCellular4Bar" to Icons.Filled.SignalCellular4Bar,
    "SignalCellularAlt1Bar" to Icons.Filled.SignalCellularAlt1Bar,
    "SignalCellularAlt2Bar" to Icons.Filled.SignalCellularAlt2Bar,
    "SignalCellularAlt" to Icons.Filled.SignalCellularAlt,
    "SignalCellularConnectedNoInternet0Bar" to Icons.Filled.SignalCellularConnectedNoInternet0Bar,
    "SignalCellularConnectedNoInternet4Bar" to Icons.Filled.SignalCellularConnectedNoInternet4Bar,
    "SignalCellularNodata" to Icons.Filled.SignalCellularNodata,
    "SignalCellularNoSim" to Icons.Filled.SignalCellularNoSim,
    "SignalCellularNull" to Icons.Filled.SignalCellularNull,
    "SignalCellularOff" to Icons.Filled.SignalCellularOff,
    "SignalWifi0Bar" to Icons.Filled.SignalWifi0Bar,
    "SignalWifi4Bar" to Icons.Filled.SignalWifi4Bar,
    "SignalWifi4BarLock" to Icons.Filled.SignalWifi4BarLock,
    "SignalWifiBad" to Icons.Filled.SignalWifiBad,
    "SignalWifiConnectedNoInternet4" to Icons.Filled.SignalWifiConnectedNoInternet4,
    "SignalWifiOff" to Icons.Filled.SignalWifiOff,
    "SignalWifiStatusbar4Bar" to Icons.Filled.SignalWifiStatusbar4Bar,
    "SignalWifiStatusbarConnectedNoInternet4" to Icons.Filled.SignalWifiStatusbarConnectedNoInternet4,
    "SignalWifiStatusbarNull" to Icons.Filled.SignalWifiStatusbarNull,
    "SignLanguage" to Icons.Filled.SignLanguage,
    "Signpost" to Icons.Filled.Signpost,
    "SimCardAlert" to Icons.Filled.SimCardAlert,
    "SimCardDownload" to Icons.Filled.SimCardDownload,
    "SimCard" to Icons.Filled.SimCard,
    "SingleBed" to Icons.Filled.SingleBed,
    "Sip" to Icons.Filled.Sip,
    "Skateboarding" to Icons.Filled.Skateboarding,
    "SkipNext" to Icons.Filled.SkipNext,
    "SkipPrevious" to Icons.Filled.SkipPrevious,
    "Sledding" to Icons.Filled.Sledding,
    "Slideshow" to Icons.Filled.Slideshow,
    "SlowMotionVideo" to Icons.Filled.SlowMotionVideo,
    "SmartButton" to Icons.Filled.SmartButton,
    "SmartDisplay" to Icons.Filled.SmartDisplay,
    "Smartphone" to Icons.Filled.Smartphone,
    "SmartScreen" to Icons.Filled.SmartScreen,
    "SmartToy" to Icons.Filled.SmartToy,
    "SmokeFree" to Icons.Filled.SmokeFree,
    "SmokingRooms" to Icons.Filled.SmokingRooms,
    "SmsFailed" to Icons.Filled.SmsFailed,
    "Sms" to Icons.Filled.Sms,
    "SnippetFolder" to Icons.Filled.SnippetFolder,
    "Snooze" to Icons.Filled.Snooze,
    "Snowboarding" to Icons.Filled.Snowboarding,
    "Snowmobile" to Icons.Filled.Snowmobile,
    "Snowshoeing" to Icons.Filled.Snowshoeing,
    "Soap" to Icons.Filled.Soap,
    "SocialDistance" to Icons.Filled.SocialDistance,
    "SolarPower" to Icons.Filled.SolarPower,
    "SortByAlpha" to Icons.Filled.SortByAlpha,
    "Sort" to Icons.AutoMirrored.Filled.Sort,
    "Sos" to Icons.Filled.Sos,
    "SoupKitchen" to Icons.Filled.SoupKitchen,
    "Source" to Icons.Filled.Source,
    "SouthAmerica" to Icons.Filled.SouthAmerica,
    "SouthEast" to Icons.Filled.SouthEast,
    "South" to Icons.Filled.South,
    "SouthWest" to Icons.Filled.SouthWest,
    "SpaceBar" to Icons.Filled.SpaceBar,
    "SpaceDashboard" to Icons.Filled.SpaceDashboard,
    "Spa" to Icons.Filled.Spa,
    "SpatialAudio" to Icons.Filled.SpatialAudio,
    "SpatialAudioOff" to Icons.Filled.SpatialAudioOff,
    "SpatialTracking" to Icons.Filled.SpatialTracking,
    "SpeakerGroup" to Icons.Filled.SpeakerGroup,
    "Speaker" to Icons.Filled.Speaker,
    "SpeakerNotes" to Icons.AutoMirrored.Filled.SpeakerNotes,
    "SpeakerNotesOff" to Icons.Filled.SpeakerNotesOff,
    "SpeakerPhone" to Icons.Filled.SpeakerPhone,
    "Speed" to Icons.Filled.Speed,
    "Spellcheck" to Icons.Filled.Spellcheck,
    "Splitscreen" to Icons.Filled.Splitscreen,
    "Spoke" to Icons.Filled.Spoke,
    "SportsBar" to Icons.Filled.SportsBar,
    "SportsBaseball" to Icons.Filled.SportsBaseball,
    "SportsBasketball" to Icons.Filled.SportsBasketball,
    "SportsCricket" to Icons.Filled.SportsCricket,
    "SportsEsports" to Icons.Filled.SportsEsports,
    "SportsFootball" to Icons.Filled.SportsFootball,
    "SportsGolf" to Icons.Filled.SportsGolf,
    "SportsGymnastics" to Icons.Filled.SportsGymnastics,
    "SportsHandball" to Icons.Filled.SportsHandball,
    "SportsHockey" to Icons.Filled.SportsHockey,
    "SportsKabaddi" to Icons.Filled.SportsKabaddi,
    "Sports" to Icons.Filled.Sports,
    "SportsMartialArts" to Icons.Filled.SportsMartialArts,
    "SportsMma" to Icons.Filled.SportsMma,
    "SportsMotorsports" to Icons.Filled.SportsMotorsports,
    "SportsRugby" to Icons.Filled.SportsRugby,
    "SportsScore" to Icons.Filled.SportsScore,
    "SportsSoccer" to Icons.Filled.SportsSoccer,
    "SportsTennis" to Icons.Filled.SportsTennis,
    "SportsVolleyball" to Icons.Filled.SportsVolleyball,
    "SquareFoot" to Icons.Filled.SquareFoot,
    "Square" to Icons.Filled.Square,
    "SsidChart" to Icons.Filled.SsidChart,
    "StackedBarChart" to Icons.Filled.StackedBarChart,
    "StackedLineChart" to Icons.Filled.StackedLineChart,
    "Stadium" to Icons.Filled.Stadium,
    "Stairs" to Icons.Filled.Stairs,
    "StarBorder" to Icons.Filled.StarBorder,
    "StarBorderPurple500" to Icons.Filled.StarBorderPurple500,
    "StarHalf" to Icons.AutoMirrored.Filled.StarHalf,
    "StarOutline" to Icons.Filled.StarOutline,
    "StarPurple500" to Icons.Filled.StarPurple500,
    "StarRate" to Icons.Filled.StarRate,
    "Stars" to Icons.Filled.Stars,
    "Start" to Icons.Filled.Start,
    "StayCurrentLandscape" to Icons.Filled.StayCurrentLandscape,
    "StayCurrentPortrait" to Icons.Filled.StayCurrentPortrait,
    "StayPrimaryLandscape" to Icons.Filled.StayPrimaryLandscape,
    "StayPrimaryPortrait" to Icons.Filled.StayPrimaryPortrait,
    "StickyNote2" to Icons.AutoMirrored.Filled.StickyNote2,
    "StopCircle" to Icons.Filled.StopCircle,
    "Stop" to Icons.Filled.Stop,
    "StopScreenShare" to Icons.AutoMirrored.Filled.StopScreenShare,
    "Storage" to Icons.Filled.Storage,
    "Storefront" to Icons.Filled.Storefront,
    "Store" to Icons.Filled.Store,
    "StoreMallDirectory" to Icons.Filled.StoreMallDirectory,
    "Storm" to Icons.Filled.Storm,
    "Straighten" to Icons.Filled.Straighten,
    "Straight" to Icons.Filled.Straight,
    "Stream" to Icons.Filled.Stream,
    "Streetview" to Icons.Filled.Streetview,
    "StrikethroughS" to Icons.Filled.StrikethroughS,
    "Stroller" to Icons.Filled.Stroller,
    "Style" to Icons.Filled.Style,
    "SubdirectoryArrowLeft" to Icons.Filled.SubdirectoryArrowLeft,
    "SubdirectoryArrowRight" to Icons.Filled.SubdirectoryArrowRight,
    "Subject" to Icons.AutoMirrored.Filled.Subject,
    "Subscriptions" to Icons.Filled.Subscriptions,
    "Subscript" to Icons.Filled.Subscript,
    "Subtitles" to Icons.Filled.Subtitles,
    "SubtitlesOff" to Icons.Filled.SubtitlesOff,
    "Subway" to Icons.Filled.Subway,
    "Summarize" to Icons.Filled.Summarize,
    "Superscript" to Icons.Filled.Superscript,
    "SupervisedUserCircle" to Icons.Filled.SupervisedUserCircle,
    "SupervisorAccount" to Icons.Filled.SupervisorAccount,
    "SupportAgent" to Icons.Filled.SupportAgent,
    "Support" to Icons.Filled.Support,
    "Surfing" to Icons.Filled.Surfing,
    "SurroundSound" to Icons.Filled.SurroundSound,
    "SwapCalls" to Icons.Filled.SwapCalls,
    "SwapHoriz" to Icons.Filled.SwapHoriz,
    "SwapHorizontalCircle" to Icons.Filled.SwapHorizontalCircle,
    "SwapVerticalCircle" to Icons.Filled.SwapVerticalCircle,
    "SwapVert" to Icons.Filled.SwapVert,
    "SwipeDownAlt" to Icons.Filled.SwipeDownAlt,
    "SwipeDown" to Icons.Filled.SwipeDown,
    "Swipe" to Icons.Filled.Swipe,
    "SwipeLeftAlt" to Icons.Filled.SwipeLeftAlt,
    "SwipeLeft" to Icons.Filled.SwipeLeft,
    "SwipeRightAlt" to Icons.Filled.SwipeRightAlt,
    "SwipeRight" to Icons.Filled.SwipeRight,
    "SwipeUpAlt" to Icons.Filled.SwipeUpAlt,
    "SwipeUp" to Icons.Filled.SwipeUp,
    "SwipeVertical" to Icons.Filled.SwipeVertical,
    "SwitchAccessShortcutAdd" to Icons.Filled.SwitchAccessShortcutAdd,
    "SwitchAccessShortcut" to Icons.Filled.SwitchAccessShortcut,
    "SwitchAccount" to Icons.Filled.SwitchAccount,
    "SwitchCamera" to Icons.Filled.SwitchCamera,
    "SwitchLeft" to Icons.Filled.SwitchLeft,
    "SwitchRight" to Icons.Filled.SwitchRight,
    "SwitchVideo" to Icons.Filled.SwitchVideo,
    "Synagogue" to Icons.Filled.Synagogue,
    "SyncAlt" to Icons.Filled.SyncAlt,
    "SyncDisabled" to Icons.Filled.SyncDisabled,
    "Sync" to Icons.Filled.Sync,
    "SyncLock" to Icons.Filled.SyncLock,
    "SyncProblem" to Icons.Filled.SyncProblem,
    "SystemSecurityUpdateGood" to Icons.Filled.SystemSecurityUpdateGood,
    "SystemSecurityUpdate" to Icons.Filled.SystemSecurityUpdate,
    "SystemSecurityUpdateWarning" to Icons.Filled.SystemSecurityUpdateWarning,
    "SystemUpdateAlt" to Icons.Filled.SystemUpdateAlt,
    "SystemUpdate" to Icons.Filled.SystemUpdate,
    "Tab" to Icons.Filled.Tab,
    "TableBar" to Icons.Filled.TableBar,
    "TableChart" to Icons.Filled.TableChart,
    "TableRestaurant" to Icons.Filled.TableRestaurant,
    "TableRows" to Icons.Filled.TableRows,
    "TabletAndroid" to Icons.Filled.TabletAndroid,
    "Tablet" to Icons.Filled.Tablet,
    "TabletMac" to Icons.Filled.TabletMac,
    "TableView" to Icons.Filled.TableView,
    "TabUnselected" to Icons.Filled.TabUnselected,
    "TagFaces" to Icons.Filled.TagFaces,
    "Tag" to Icons.Filled.Tag,
    "TakeoutDining" to Icons.Filled.TakeoutDining,
    "TapAndPlay" to Icons.Filled.TapAndPlay,
    "Tapas" to Icons.Filled.Tapas,
    "TaskAlt" to Icons.Filled.TaskAlt,
    "Task" to Icons.Filled.Task,
    "TaxiAlert" to Icons.Filled.TaxiAlert,
    "TempleBuddhist" to Icons.Filled.TempleBuddhist,
    "TempleHindu" to Icons.Filled.TempleHindu,
    "Terminal" to Icons.Filled.Terminal,
    "Terrain" to Icons.Filled.Terrain,
    "TextDecrease" to Icons.Filled.TextDecrease,
    "TextFields" to Icons.Filled.TextFields,
    "TextFormat" to Icons.Filled.TextFormat,
    "TextIncrease" to Icons.Filled.TextIncrease,
    "TextRotateUp" to Icons.Filled.TextRotateUp,
    "TextRotateVertical" to Icons.Filled.TextRotateVertical,
    "TextRotationAngledown" to Icons.Filled.TextRotationAngledown,
    "TextRotationAngleup" to Icons.Filled.TextRotationAngleup,
    "TextRotationDown" to Icons.Filled.TextRotationDown,
    "TextRotationNone" to Icons.Filled.TextRotationNone,
    "Textsms" to Icons.Filled.Textsms,
    "TextSnippet" to Icons.AutoMirrored.Filled.TextSnippet,
    "Texture" to Icons.Filled.Texture,
    "TheaterComedy" to Icons.Filled.TheaterComedy,
    "Theaters" to Icons.Filled.Theaters,
    "ThermostatAuto" to Icons.Filled.ThermostatAuto,
    "Thermostat" to Icons.Filled.Thermostat,
    "ThumbDownAlt" to Icons.Filled.ThumbDownAlt,
    "ThumbDown" to Icons.Filled.ThumbDown,
    "ThumbDownOffAlt" to Icons.Filled.ThumbDownOffAlt,
    "ThumbsUpDown" to Icons.Filled.ThumbsUpDown,
    "ThumbUpAlt" to Icons.Filled.ThumbUpAlt,
    "ThumbUpOffAlt" to Icons.Filled.ThumbUpOffAlt,
    "Thunderstorm" to Icons.Filled.Thunderstorm,
    "Timelapse" to Icons.Filled.Timelapse,
    "Timeline" to Icons.Filled.Timeline,
    "Timer3" to Icons.Filled.Timer3,
    "Timer3Select" to Icons.Filled.Timer3Select,
    "Timer10" to Icons.Filled.Timer10,
    "Timer10Select" to Icons.Filled.Timer10Select,
    "Timer" to Icons.Filled.Timer,
    "TimerOff" to Icons.Filled.TimerOff,
    "TimeToLeave" to Icons.Filled.TimeToLeave,
    "TipsAndUpdates" to Icons.Filled.TipsAndUpdates,
    "TireRepair" to Icons.Filled.TireRepair,
    "Title" to Icons.Filled.Title,
    "Toc" to Icons.AutoMirrored.Filled.Toc,
    "Today" to Icons.Filled.Today,
    "ToggleOff" to Icons.Filled.ToggleOff,
    "ToggleOn" to Icons.Filled.ToggleOn,
    "Token" to Icons.Filled.Token,
    "Toll" to Icons.Filled.Toll,
    "Tonality" to Icons.Filled.Tonality,
    "Topic" to Icons.Filled.Topic,
    "Tornado" to Icons.Filled.Tornado,
    "TouchApp" to Icons.Filled.TouchApp,
    "Tour" to Icons.Filled.Tour,
    "Toys" to Icons.Filled.Toys,
    "TrackChanges" to Icons.Filled.TrackChanges,
    "Traffic" to Icons.Filled.Traffic,
    "Train" to Icons.Filled.Train,
    "Tram" to Icons.Filled.Tram,
    "Transcribe" to Icons.Filled.Transcribe,
    "TransferWithinAStation" to Icons.Filled.TransferWithinAStation,
    "Transform" to Icons.Filled.Transform,
    "Transgender" to Icons.Filled.Transgender,
    "TransitEnterexit" to Icons.Filled.TransitEnterexit,
    "Translate" to Icons.Filled.Translate,
    "TravelExplore" to Icons.Filled.TravelExplore,
    "TrendingDown" to Icons.AutoMirrored.Filled.TrendingDown,
    "TrendingFlat" to Icons.AutoMirrored.Filled.TrendingFlat,
    "TrendingUp" to Icons.AutoMirrored.Filled.TrendingUp,
    "TripOrigin" to Icons.Filled.TripOrigin,
    "Troubleshoot" to Icons.Filled.Troubleshoot,
    "Try" to Icons.Filled.Try,
    "Tsunami" to Icons.Filled.Tsunami,
    "Tty" to Icons.Filled.Tty,
    "Tune" to Icons.Filled.Tune,
    "Tungsten" to Icons.Filled.Tungsten,
    "TurnedIn" to Icons.Filled.TurnedIn,
    "TurnedInNot" to Icons.Filled.TurnedInNot,
    "TurnLeft" to Icons.Filled.TurnLeft,
    "TurnRight" to Icons.Filled.TurnRight,
    "TurnSharpLeft" to Icons.Filled.TurnSharpLeft,
    "TurnSharpRight" to Icons.Filled.TurnSharpRight,
    "TurnSlightLeft" to Icons.Filled.TurnSlightLeft,
    "TurnSlightRight" to Icons.Filled.TurnSlightRight,
    "Tv" to Icons.Filled.Tv,
    "TvOff" to Icons.Filled.TvOff,
    "TwoWheeler" to Icons.Filled.TwoWheeler,
    "TypeSpecimen" to Icons.Filled.TypeSpecimen,
    "Umbrella" to Icons.Filled.Umbrella,
    "Unarchive" to Icons.Filled.Unarchive,
    "Undo" to Icons.AutoMirrored.Filled.Undo,
    "UnfoldLessDouble" to Icons.Filled.UnfoldLessDouble,
    "UnfoldLess" to Icons.Filled.UnfoldLess,
    "UnfoldMoreDouble" to Icons.Filled.UnfoldMoreDouble,
    "UnfoldMore" to Icons.Filled.UnfoldMore,
    "Unpublished" to Icons.Filled.Unpublished,
    "Unsubscribe" to Icons.Filled.Unsubscribe,
    "Upcoming" to Icons.Filled.Upcoming,
    "UpdateDisabled" to Icons.Filled.UpdateDisabled,
    "Update" to Icons.Filled.Update,
    "Upgrade" to Icons.Filled.Upgrade,
    "UploadFile" to Icons.Filled.UploadFile,
    "Upload" to Icons.Filled.Upload,
    "Usb" to Icons.Filled.Usb,
    "UsbOff" to Icons.Filled.UsbOff,
    "UTurnLeft" to Icons.Filled.UTurnLeft,
    "UTurnRight" to Icons.Filled.UTurnRight,
    "Vaccines" to Icons.Filled.Vaccines,
    "VapeFree" to Icons.Filled.VapeFree,
    "VapingRooms" to Icons.Filled.VapingRooms,
    "Verified" to Icons.Filled.Verified,
    "VerifiedUser" to Icons.Filled.VerifiedUser,
    "VerticalAlignBottom" to Icons.Filled.VerticalAlignBottom,
    "VerticalAlignCenter" to Icons.Filled.VerticalAlignCenter,
    "VerticalAlignTop" to Icons.Filled.VerticalAlignTop,
    "VerticalDistribute" to Icons.Filled.VerticalDistribute,
    "VerticalShadesClosed" to Icons.Filled.VerticalShadesClosed,
    "VerticalShades" to Icons.Filled.VerticalShades,
    "VerticalSplit" to Icons.Filled.VerticalSplit,
    "Vibration" to Icons.Filled.Vibration,
    "VideoCall" to Icons.Filled.VideoCall,
    "VideoCameraBack" to Icons.Filled.VideoCameraBack,
    "VideoCameraFront" to Icons.Filled.VideoCameraFront,
    "Videocam" to Icons.Filled.Videocam,
    "VideocamOff" to Icons.Filled.VideocamOff,
    "VideoChat" to Icons.Filled.VideoChat,
    "VideoFile" to Icons.Filled.VideoFile,
    "VideogameAsset" to Icons.Filled.VideogameAsset,
    "VideogameAssetOff" to Icons.Filled.VideogameAssetOff,
    "VideoLabel" to Icons.Filled.VideoLabel,
    "VideoLibrary" to Icons.Filled.VideoLibrary,
    "VideoSettings" to Icons.Filled.VideoSettings,
    "VideoStable" to Icons.Filled.VideoStable,
    "ViewAgenda" to Icons.Filled.ViewAgenda,
    "ViewArray" to Icons.Filled.ViewArray,
    "ViewCarousel" to Icons.Filled.ViewCarousel,
    "ViewColumn" to Icons.Filled.ViewColumn,
    "ViewComfyAlt" to Icons.Filled.ViewComfyAlt,
    "ViewComfy" to Icons.Filled.ViewComfy,
    "ViewCompactAlt" to Icons.Filled.ViewCompactAlt,
    "ViewCompact" to Icons.Filled.ViewCompact,
    "ViewCozy" to Icons.Filled.ViewCozy,
    "ViewDay" to Icons.Filled.ViewDay,
    "ViewHeadline" to Icons.Filled.ViewHeadline,
    "ViewInAr" to Icons.Filled.ViewInAr,
    "ViewKanban" to Icons.Filled.ViewKanban,
    "ViewList" to Icons.AutoMirrored.Filled.ViewList,
    "ViewModule" to Icons.Filled.ViewModule,
    "ViewQuilt" to Icons.AutoMirrored.Filled.ViewQuilt,
    "ViewSidebar" to Icons.AutoMirrored.Filled.ViewSidebar,
    "ViewStream" to Icons.Filled.ViewStream,
    "ViewTimeline" to Icons.Filled.ViewTimeline,
    "ViewWeek" to Icons.Filled.ViewWeek,
    "Vignette" to Icons.Filled.Vignette,
    "Villa" to Icons.Filled.Villa,
    "Visibility" to Icons.Filled.Visibility,
    "VisibilityOff" to Icons.Filled.VisibilityOff,
    "VoiceChat" to Icons.Filled.VoiceChat,
    "Voicemail" to Icons.Filled.Voicemail,
    "VoiceOverOff" to Icons.Filled.VoiceOverOff,
    "Volcano" to Icons.Filled.Volcano,
    "VolumeDown" to Icons.AutoMirrored.Filled.VolumeDown,
    "VolumeMute" to Icons.AutoMirrored.Filled.VolumeMute,
    "VolumeOff" to Icons.AutoMirrored.Filled.VolumeOff,
    "VolumeUp" to Icons.AutoMirrored.Filled.VolumeUp,
    "VolunteerActivism" to Icons.Filled.VolunteerActivism,
    "VpnKey" to Icons.Filled.VpnKey,
    "VpnKeyOff" to Icons.Filled.VpnKeyOff,
    "VpnLock" to Icons.Filled.VpnLock,
    "Vrpano" to Icons.Filled.Vrpano,
    "Wallet" to Icons.Filled.Wallet,
    "Wallpaper" to Icons.Filled.Wallpaper,
    "Warehouse" to Icons.Filled.Warehouse,
    "WarningAmber" to Icons.Filled.WarningAmber,
    "Wash" to Icons.Filled.Wash,
    "Watch" to Icons.Filled.Watch,
    "WatchLater" to Icons.Filled.WatchLater,
    "WatchOff" to Icons.Filled.WatchOff,
    "WaterDamage" to Icons.Filled.WaterDamage,
    "WaterDrop" to Icons.Filled.WaterDrop,
    "WaterfallChart" to Icons.Filled.WaterfallChart,
    "Water" to Icons.Filled.Water,
    "Waves" to Icons.Filled.Waves,
    "WavingHand" to Icons.Filled.WavingHand,
    "WbAuto" to Icons.Filled.WbAuto,
    "WbCloudy" to Icons.Filled.WbCloudy,
    "WbIncandescent" to Icons.Filled.WbIncandescent,
    "WbIridescent" to Icons.Filled.WbIridescent,
    "WbShade" to Icons.Filled.WbShade,
    "WbSunny" to Icons.Filled.WbSunny,
    "WbTwilight" to Icons.Filled.WbTwilight,
    "Wc" to Icons.Filled.Wc,
    "WebAsset" to Icons.Filled.WebAsset,
    "WebAssetOff" to Icons.Filled.WebAssetOff,
    "Webhook" to Icons.Filled.Webhook,
    "Web" to Icons.Filled.Web,
    "WebStories" to Icons.Filled.WebStories,
    "Weekend" to Icons.Filled.Weekend,
    "West" to Icons.Filled.West,
    "Whatsapp" to Icons.Filled.Whatsapp,
    "Whatshot" to Icons.Filled.Whatshot,
    "WheelchairPickup" to Icons.Filled.WheelchairPickup,
    "WhereToVote" to Icons.Filled.WhereToVote,
    "Widgets" to Icons.Filled.Widgets,
    "WidthFull" to Icons.Filled.WidthFull,
    "WidthNormal" to Icons.Filled.WidthNormal,
    "WidthWide" to Icons.Filled.WidthWide,
    "Wifi1Bar" to Icons.Filled.Wifi1Bar,
    "Wifi2Bar" to Icons.Filled.Wifi2Bar,
    "WifiCalling3" to Icons.Filled.WifiCalling3,
    "WifiCalling" to Icons.Filled.WifiCalling,
    "WifiChannel" to Icons.Filled.WifiChannel,
    "WifiFind" to Icons.Filled.WifiFind,
    "Wifi" to Icons.Filled.Wifi,
    "WifiLock" to Icons.Filled.WifiLock,
    "WifiOff" to Icons.Filled.WifiOff,
    "WifiPassword" to Icons.Filled.WifiPassword,
    "WifiProtectedSetup" to Icons.Filled.WifiProtectedSetup,
    "WifiTetheringError" to Icons.Filled.WifiTetheringError,
    "WifiTetheringErrorRounded" to Icons.Filled.WifiTetheringErrorRounded,
    "WifiTethering" to Icons.Filled.WifiTethering,
    "WifiTetheringOff" to Icons.Filled.WifiTetheringOff,
    "Window" to Icons.Filled.Window,
    "WindPower" to Icons.Filled.WindPower,
    "WineBar" to Icons.Filled.WineBar,
    "Woman2" to Icons.Filled.Woman2,
    "Woman" to Icons.Filled.Woman,
    "WorkHistory" to Icons.Filled.WorkHistory,
    "Work" to Icons.Filled.Work,
    "WorkOff" to Icons.Filled.WorkOff,
    "WorkOutline" to Icons.Filled.WorkOutline,
    "WorkspacePremium" to Icons.Filled.WorkspacePremium,
    "Workspaces" to Icons.Filled.Workspaces,
    "WrapText" to Icons.AutoMirrored.Filled.WrapText,
    "WrongLocation" to Icons.Filled.WrongLocation,
    "Wysiwyg" to Icons.AutoMirrored.Filled.Wysiwyg,
    "Yard" to Icons.Filled.Yard,
    "YoutubeSearchedFor" to Icons.Filled.YoutubeSearchedFor,
    "ZoomIn" to Icons.Filled.ZoomIn,
    "ZoomInMap" to Icons.Filled.ZoomInMap,
    "ZoomOut" to Icons.Filled.ZoomOut,
    "ZoomOutMap" to Icons.Filled.ZoomOutMap
)

@Composable
fun IconByName(
    name: String,
    color: Color = Color.Companion.Unspecified,
    modifier: Modifier = Modifier
) {
    val icon: ImageVector? = remember(name) { iconByName[name] }
    if (icon != null) {
        Icon(icon, name, tint = color, modifier = modifier)
    }
}
